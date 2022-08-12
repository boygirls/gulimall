package com.fxc.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxc.common.utils.PageUtils;
import com.fxc.gulimallproduct.entity.PmsProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 12:54:10
 */
public interface PmsProductAttrValueService extends IService<PmsProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

