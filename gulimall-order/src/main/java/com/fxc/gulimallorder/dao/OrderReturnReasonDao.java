package com.fxc.gulimallorder.dao;

import com.fxc.gulimallorder.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:50:56
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
