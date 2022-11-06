package com.fxc.gulimallmember.feign;

import com.fxc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author FXC
 * @version 1.0
 * @date 2022/8/13 15:58
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/gulimallcoupon/coupon/member/list")
    public R membercoupons();
}
