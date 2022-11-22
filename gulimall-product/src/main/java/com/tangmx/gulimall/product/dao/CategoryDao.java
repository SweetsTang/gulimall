package com.tangmx.gulimall.product.dao;

import com.tangmx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-11 22:27:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
