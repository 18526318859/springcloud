package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//开启zuul拦截代理
public class SpringCloud9527_zuul {
    public static void main(String[] args) {
            SpringApplication.run ( SpringCloud9527_zuul.class,args );
    }
}
