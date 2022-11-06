package com.fxc.gulimallorder.dao;

import com.fxc.gulimallorder.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:50:56
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
