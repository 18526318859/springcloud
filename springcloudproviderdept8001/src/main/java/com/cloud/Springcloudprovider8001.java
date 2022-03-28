package com.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient//表示该实例启动后会自动注册到eureka注册中心
public class Springcloudprovider8001 {
    public static void main(String[] args) {
        SpringApplication.run ( Springcloudprovider8001.class,args );
    }
    @Bean//固定代码
    public ServletRegistrationBean hystrixMetricsStreamServle(){
        ServletRegistrationBean re = new ServletRegistrationBean ( new HystrixMetricsStreamServlet ( ) );
    re.addUrlMappings ( "/actuator/hystrix.stream" );
    return re;
    }
}
