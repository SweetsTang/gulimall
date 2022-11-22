package com.tangmx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangmx.common.utils.PageUtils;
import com.tangmx.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:38:40
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

