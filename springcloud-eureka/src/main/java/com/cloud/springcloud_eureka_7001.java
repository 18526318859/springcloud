package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启EurekaServer服务端
public class springcloud_eureka_7001 {
    /*导入依赖
    * 编写配置文件yml
    * 加@Eable。。。注解启动
    * 编写启动类*/
    public static void main(String[] args) {
        SpringApplication.run ( springcloud_eureka_7001.class,args );
    }
}
