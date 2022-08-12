package com.fxc.gulimallproduct.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fxc.gulimallproduct.entity.PmsCategoryEntity;
import com.fxc.gulimallproduct.service.PmsCategoryService;
import com.fxc.common.utils.PageUtils;
import com.fxc.common.utils.R;



/**
 * 商品三级分类
 *
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 12:54:10
 */
@RestController
@RequestMapping("gulimallproduct/pmscategory")
public class PmsCategoryController {
    @Autowired
    private PmsCategoryService pmsCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("gulimallproduct:pmscategory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("gulimallproduct:pmscategory:info")
    public R info(@PathVariable("catId") Long catId){
		PmsCategoryEntity pmsCategory = pmsCategoryService.getById(catId);

        return R.ok().put("pmsCategory", pmsCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("gulimallproduct:pmscategory:save")
    public R save(@RequestBody PmsCategoryEntity pmsCategory){
		pmsCategoryService.save(pmsCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("gulimallproduct:pmscategory:update")
    public R update(@RequestBody PmsCategoryEntity pmsCategory){
		pmsCategoryService.updateById(pmsCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("gulimallproduct:pmscategory:delete")
    public R delete(@RequestBody Long[] catIds){
		pmsCategoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
