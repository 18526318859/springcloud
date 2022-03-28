package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//表示该实例启动后会自动注册到eureka注册中心
public class Springcloudprovider8002 {
    public static void main(String[] args) {
        SpringApplication.run ( Springcloudprovider8002.class,args );
    }
}
