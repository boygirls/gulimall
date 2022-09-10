package com.fxc.gulimallproduct.service.impl;

import com.fxc.gulimallproduct.entity.PmsCategoryEntity;
import com.fxc.gulimallproduct.service.PmsCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fxc.common.utils.PageUtils;
import com.fxc.common.utils.Query;

import com.fxc.gulimallproduct.dao.PmsCategoryDao;



@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PmsCategoryEntity> listWithTree() {
        // 1.查出所有分类
        List<PmsCategoryEntity> pmsCategoryEntities = baseMapper.selectList(null);
        // 2.组装父子树形结构
        List<PmsCategoryEntity> collect = pmsCategoryEntities.stream().filter(pmsCategoryEntity ->
                pmsCategoryEntity.getParentCid() == 0)
                .map((menu)->{
                    menu.setChildren(getChildren(menu,pmsCategoryEntities));
                    return menu;
                })
                .sorted((menu1,menu2)->{
                    return (menu1.getSort() == null ? 0:menu1.getSort()) - (menu2.getSort() == null ? 0:menu2.getSort());
                })
                .collect(Collectors.toList());


        return collect;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {

        // TODO 1.检查当前菜单是否被其他地方引用
        baseMapper.deleteBatchIds(asList);
    }

    private List<PmsCategoryEntity> getChildren(PmsCategoryEntity root,List<PmsCategoryEntity> all){

        List<PmsCategoryEntity> children = all.stream().filter(PmsCategoryEntity -> {
            return PmsCategoryEntity.getParentCid() == root.getCatId();
        }).map((PmsCategoryEntity) -> {
            // 1.找到子菜单
            PmsCategoryEntity.setChildren(getChildren(PmsCategoryEntity, all));
            return PmsCategoryEntity;
        }).sorted((menu1, menu2) -> {
            // 2.菜单排序
            return (menu1.getSort() == null ? 0:menu1.getSort()) - (menu2.getSort() == null ? 0:menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }

}