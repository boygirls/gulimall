package com.fxc.gulimallorder.dao;

import com.fxc.gulimallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:50:57
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
