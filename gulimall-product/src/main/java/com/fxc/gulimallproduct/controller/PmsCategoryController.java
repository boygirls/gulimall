package com.fxc.gulimallproduct.controller;

import java.util.Arrays;
import java.util.List;
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
     * 查出所有分类及子类，以树形结构组装起来
     */
    @RequestMapping("/list/tree")
    //@RequiresPermissions("gulimallproduct:pmscategory:list")
    public R list(){
        List<PmsCategoryEntity> category =  pmsCategoryService.listWithTree();

        return R.ok().put("page", category);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("gulimallproduct:pmscategory:info")
    public R info(@PathVariable("catId") Long catId){
		PmsCategoryEntity pmsCategory = pmsCategoryService.getById(catId);

        return R.ok().put("data", pmsCategory);
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
    @RequestMapping("/update/sort")
    //@RequiresPermissions("gulimallproduct:pmscategory:update")
    public R updateSort(@RequestBody PmsCategoryEntity[] pmsCategory){
        pmsCategoryService.updateBatchById(Arrays.asList(pmsCategory));

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
     * mvc自动将请求的的数据json，转换为相应的对象
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("gulimallproduct:pmscategory:delete")
    public R delete(@RequestBody Long[] catIds){
        // 1.检查当前的菜单，是否被别的地方引用

		// pmsCategoryService.removeByIds(Arrays.asList(catIds));
        pmsCategoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
