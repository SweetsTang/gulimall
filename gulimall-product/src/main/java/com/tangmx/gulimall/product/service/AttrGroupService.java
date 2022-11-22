package com.tangmx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangmx.common.utils.PageUtils;
import com.tangmx.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-11 22:27:11
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

