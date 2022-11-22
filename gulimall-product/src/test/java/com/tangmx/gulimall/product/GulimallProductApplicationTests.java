package com.tangmx.gulimall.product;

import com.tangmx.gulimall.product.entity.BrandEntity;
import com.tangmx.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Thomson
 * @description:
 * @date 2022/11/12 9:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功。。。");
    }

}
