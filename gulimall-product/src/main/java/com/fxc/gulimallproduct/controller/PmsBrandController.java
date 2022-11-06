package com.fxc.gulimallproduct.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fxc.common.valid.AddGroup;
import com.fxc.common.valid.UpdateGroup;
import com.fxc.common.valid.UpdateStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fxc.gulimallproduct.entity.PmsBrandEntity;
import com.fxc.gulimallproduct.service.PmsBrandService;
import com.fxc.common.utils.PageUtils;
import com.fxc.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 12:54:10
 */
@RestController
@RequestMapping("gulimallproduct/pmsbrand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("gulimallproduct:pmsbrand:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = pmsBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("gulimallproduct:pmsbrand:info")
    public R info(@PathVariable("brandId") Long brandId) {
        PmsBrandEntity pmsBrand = pmsBrandService.getById(brandId);

        return R.ok().put("pmsBrand", pmsBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("gulimallproduct:pmsbrand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody PmsBrandEntity pmsBrand) {

//        Map<String,String> map = new HashMap<>();
//
//        if (result.hasErrors()) {
//            // 1. 获取校验的错误结果
//            result.getFieldErrors().forEach((item)->{
//                // 获取错误提示
//                String message = item.getDefaultMessage();
//
//                // 获取错误提示属性的名字
//                String field = item.getField();
//
//                map.put(field,message);
//            });
//
//            return R.error(400,"提交的数据不合法").put("data", map);
//        } else {
//            pmsBrandService.save(pmsBrand);
//            return R.ok();
//        }
        pmsBrandService.save(pmsBrand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("gulimallproduct:pmsbrand:update")
    public R update(@Validated({UpdateGroup.class}) @RequestBody PmsBrandEntity pmsBrand) {
        pmsBrandService.updateById(pmsBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update/status")
    //@RequiresPermissions("gulimallproduct:pmsbrand:update")
    public R updateStatus(@Validated({UpdateStatus.class}) @RequestBody PmsBrandEntity pmsBrand) {
        pmsBrandService.updateById(pmsBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("gulimallproduct:pmsbrand:delete")
    public R delete(@RequestBody Long[] brandIds) {
        pmsBrandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
