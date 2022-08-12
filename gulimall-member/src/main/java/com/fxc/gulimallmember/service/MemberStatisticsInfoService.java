package com.fxc.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxc.common.utils.PageUtils;
import com.fxc.gulimallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 16:27:29
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

