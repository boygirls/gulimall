package com.fxc.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxc.common.utils.PageUtils;
import com.fxc.gulimallorder.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:50:56
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

