package com.example.seataorderservice.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seataorderservice.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 *  order
 * @author gyq 2020-03-18
 */
@Repository
@Mapper
public interface OrderMapper extends BaseMapper<OrderDTO> {

    /**
     * 创建订单
     */
    void create(OrderDTO order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
