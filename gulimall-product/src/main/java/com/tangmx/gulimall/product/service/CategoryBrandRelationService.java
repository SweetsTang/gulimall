package com.tangmx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangmx.common.utils.PageUtils;
import com.tangmx.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-11 22:27:11
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

