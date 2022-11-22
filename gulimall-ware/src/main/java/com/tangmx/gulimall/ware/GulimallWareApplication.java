package com.tangmx.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Thomson
 * @description:
 * @date 2022/11/12 16:59
 */
@SpringBootApplication
@MapperScan("com.tangmx.gulimall.ware.dao")
@EnableDiscoveryClient
public class GulimallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }
}
