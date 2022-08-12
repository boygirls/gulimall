package com.fxc.gulimallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fxc.gulimallproduct.entity.PmsBrandEntity;
import com.fxc.gulimallproduct.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    PmsBrandService brandService;

    @Test
    void contextLoads() {

//        PmsBrandEntity brandEntity = new PmsBrandEntity();
//
//        brandEntity.setName("公司");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<PmsBrandEntity> brand_id = brandService.list(new QueryWrapper<PmsBrandEntity>().eq("brand_id", 1L));

        brand_id.forEach((item)->{
            System.out.println(item);
        });
    }

}
