package com.example.seataorderservice.service.impl;

import com.example.seataorderservice.dto.OrderDTO;
import com.example.seataorderservice.mapper.OrderMapper;
import com.example.seataorderservice.service.OrderService;
import com.example.seataorderservice.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * order 订单业务实现类
 * @author gyq
 * @date 2020/03/18
 */
@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageService storageService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     */
    @Override
    @GlobalTransactional(timeoutMills = 300000, name = "seata-order-service",rollbackFor = Exception.class)
    public void create(OrderDTO order) {
        LOGGER.info("------->下单开始");
        //本应用创建订单
        orderMapper.create(order);

        //远程调用库存服务扣减库存
        LOGGER.info("------->order-service中扣减库存开始");
        storageService.decrease(order.getProductId(),order.getCount());
        LOGGER.info("------->order-service中扣减库存结束");

        //修改订单状态为已完成
        LOGGER.info("------->order-service中修改订单状态开始");
        orderMapper.update(order.getUserId(),0);
        LOGGER.info("------->order-service中修改订单状态结束");

        LOGGER.info("------->下单结束");
    }


}

