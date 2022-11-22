package com.tangmx.gulimall.coupon.dao;

import com.tangmx.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:38:41
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
