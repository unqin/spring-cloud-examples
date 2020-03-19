package com.example.seataorderservice.service;

import com.example.seataorderservice.dto.OrderDTO;

/**
 * order
 * @author gyq
 * @date 2020/03/18
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(OrderDTO order);
}

