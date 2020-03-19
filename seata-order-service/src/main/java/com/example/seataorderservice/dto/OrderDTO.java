package com.example.seataorderservice.dto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * order
 * @author gyq 2020-03-17
 */
@Data
@ApiModel("order")
public class OrderDTO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("产品id")
    private Long productId;

    @ApiModelProperty("数量")
    private Integer count;

    @ApiModelProperty("金额")
    private Integer money;

    @ApiModelProperty("订单状态：0：创建中；1：已完结")
    private Integer status;

}
