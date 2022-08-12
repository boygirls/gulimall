package com.fxc.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxc.common.utils.PageUtils;
import com.fxc.gulimallcoupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:14:49
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

