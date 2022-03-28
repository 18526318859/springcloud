package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//开启监控
public class SpringConsumer9001_hystric_dashboard {
    public static void main(String[] args) {

            SpringApplication.run ( SpringConsumer9001_hystric_dashboard.class,args );
    }
}
