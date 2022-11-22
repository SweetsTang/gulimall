package com.tangmx.gulimall.ware.dao;

import com.tangmx.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author tangmx
 * @email tangmx@gmail.com
 * @date 2022-11-12 16:57:52
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
