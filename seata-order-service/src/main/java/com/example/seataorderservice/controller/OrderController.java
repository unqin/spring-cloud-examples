package com.example.seataorderservice.controller;

import com.example.seataorderservice.domain.CommonResult;
import com.example.seataorderservice.dto.OrderDTO;
import com.example.seataorderservice.mapper.OrderMapper;
import com.example.seataorderservice.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * order
 * @author gyq
 * @date 2020/03/18
 */
@RestController
@RequestMapping(value = "/Order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private OrderMapper orderMapper;

    /**
     * 创建订单
     */
    @GetMapping("/create")
    public CommonResult create(OrderDTO order) {
        orderService.create(order);
        return new CommonResult("订单创建成功!", 200);
    }

}

