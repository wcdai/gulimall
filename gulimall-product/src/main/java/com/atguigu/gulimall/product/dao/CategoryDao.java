package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wcdai
 * @email wchdai1017@gmail.com
 * @date 2021-09-04 11:49:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
