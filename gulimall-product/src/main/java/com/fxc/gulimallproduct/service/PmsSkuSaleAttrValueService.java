package com.fxc.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxc.common.utils.PageUtils;
import com.fxc.gulimallproduct.entity.PmsSkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 12:54:10
 */
public interface PmsSkuSaleAttrValueService extends IService<PmsSkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

