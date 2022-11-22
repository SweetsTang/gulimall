package com.tangmx.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Thomson
 * @description:
 * @date 2022/11/12 16:50
 */
@SpringBootApplication
@MapperScan("com.tangmx.gulimall.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.tangmx.gulimall.member.feign")
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }
}
