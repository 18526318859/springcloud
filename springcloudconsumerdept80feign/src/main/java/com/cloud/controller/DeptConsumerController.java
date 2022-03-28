package com.cloud.controller;

import com.cloud.pojo.Dept;
import com.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
   /* 在消费者模型中，并没有service层，
    我们只能通过 RestTemplate实现调用，
    前提是需要将 RestTemplate注册到bean中，
     RestTemplate就是提供给我们远程访问http服务的方法*/
    /*@Autowired
    RestTemplate restTemplate;*/
    //使用ribbon负载均衡时，REST_URL应该是一个变量
   // private static  final  String REST_URL="http://localhost:8001";
    //SPRINGCLOUD-PROVIDER-DEPT为application名
  /*  private static  final  String REST_URL="http://SPRINGCLOUD-PROVIDER-DEPT";*/
  @Autowired
  DeptClientService deptClientService=null;
     @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
       return  this.deptClientService.addDept ( dept );

    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
         return this.deptClientService.queryAll ();

    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return this.deptClientService.queryById ( id );
    }

}
