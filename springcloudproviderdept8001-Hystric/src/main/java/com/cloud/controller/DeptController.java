package com.cloud.controller;

import com.cloud.pojo.Dept;
import com.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept)
    {
        return deptService.addDept ( dept );
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "Hystric_get")//执行失败就去调用备选方法
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptService.queryById ( id );
        if(dept==null)
        {
            throw new RuntimeException ( "fail" );
        }
        return dept;
    }
   //备选方法
   public Dept Hystric_get(@PathVariable("id") Long id)
   {

       return new Dept ( ).setDeptno ( id ).setDname ( "无此id信息，信息提示来自@Hystric" )
               .setDb_source ( "dataSouce No Found" );
   }


    @GetMapping("/dept/list")
    public List<Dept> queryall(Dept dept)
    {
        return deptService.queryAll ();
    }
}
