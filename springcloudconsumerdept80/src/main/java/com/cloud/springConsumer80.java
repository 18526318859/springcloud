package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class springConsumer80 {
    public static void main(String[] args) {

            SpringApplication.run ( springConsumer80.class,args );
    }
}
