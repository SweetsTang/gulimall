package com.tangmx.gulimall.order.dao;

import com.tangmx.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:54:18
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
