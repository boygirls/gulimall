package com.fxc.gulimallware.dao;

import com.fxc.gulimallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 17:06:03
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
