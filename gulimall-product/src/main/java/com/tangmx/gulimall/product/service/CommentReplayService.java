package com.tangmx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangmx.common.utils.PageUtils;
import com.tangmx.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-11 22:27:11
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

