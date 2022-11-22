package com.tangmx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangmx.common.utils.PageUtils;
import com.tangmx.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-11 22:27:11
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

