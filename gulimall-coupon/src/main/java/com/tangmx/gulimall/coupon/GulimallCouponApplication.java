package com.tangmx.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Thomson
 * @description:
 * @date 2022/11/12 16:42
 */
@SpringBootApplication
@MapperScan("com.tangmx.gulimall.coupon.dao")
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }
}
