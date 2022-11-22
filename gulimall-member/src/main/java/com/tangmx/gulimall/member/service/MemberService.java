package com.tangmx.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangmx.common.utils.PageUtils;
import com.tangmx.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:48:37
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

