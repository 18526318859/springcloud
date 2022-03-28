package com.cloud.controller;

import com.cloud.pojo.Dept;
import com.cloud.service.DeptService;
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
    public Dept get(@PathVariable("id") Long id)
    {
        return deptService.queryById ( id );
    }

    @GetMapping("/dept/list")
    public List<Dept> queryall(Dept dept)
    {
        return deptService.queryAll ();
    }
}
