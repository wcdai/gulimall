package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        final List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().lambda().eq(BrandEntity::getBrandId, 1));
        final List<BrandEntity> brand_id2 = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        brandService.save(new BrandEntity());
        System.out.println("brand_id = " + brand_id);
        System.out.println("brand_id2 = " + brand_id2);
    }

}
