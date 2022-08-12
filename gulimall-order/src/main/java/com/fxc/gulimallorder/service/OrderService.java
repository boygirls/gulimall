package com.fxc.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxc.common.utils.PageUtils;
import com.fxc.gulimallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:50:57
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

