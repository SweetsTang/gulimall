package com.tangmx.gulimall.member.dao;

import com.tangmx.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:48:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
