package com.fxc.gulimallware.dao;

import com.fxc.gulimallware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 17:06:02
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
