package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//表示该实例启动后会自动注册到eureka注册中心
@EnableCircuitBreaker//断路器，开启对熔断的支持
public class Springcloudprovider8001_Hystric {
    public static void main(String[] args) {
        SpringApplication.run ( Springcloudprovider8001_Hystric.class,args );
    }
}
