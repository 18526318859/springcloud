package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.cloud")//开启FeignClients功能，扫包
@ComponentScan("com.cloud")//组件扫包
public class SpringConsumer80_feign {
    public static void main(String[] args) {

            SpringApplication.run ( SpringConsumer80_feign.class,args );
    }
}
