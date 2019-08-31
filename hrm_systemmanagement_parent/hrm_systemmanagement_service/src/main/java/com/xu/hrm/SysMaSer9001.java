package com.xu.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xu.hrm.mapper")
public class SysMaSer9001 {
    public static void main(String[] args) {
        SpringApplication.run(SysMaSer9001.class, args);
    }
}
