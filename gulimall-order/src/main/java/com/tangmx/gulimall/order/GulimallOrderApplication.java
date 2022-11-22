package com.tangmx.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Thomson
 * @description:
 * @date 2022/11/12 16:55
 */
@SpringBootApplication
@MapperScan("com.tangmx.gulimall.order.dao")
@EnableDiscoveryClient
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }
}
