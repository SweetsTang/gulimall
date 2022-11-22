package com.tangmx.gulimall.order.dao;

import com.tangmx.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:54:18
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
