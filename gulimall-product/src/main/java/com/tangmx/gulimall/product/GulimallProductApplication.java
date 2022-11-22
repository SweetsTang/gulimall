package com.tangmx.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Thomson
 * @description:
 * @date 2022/11/12 8:51
 */
@SpringBootApplication
@MapperScan("com.tangmx.gulimall.product.dao")
@EnableDiscoveryClient
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
