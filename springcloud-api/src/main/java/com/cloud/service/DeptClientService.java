package com.cloud.service;

import com.cloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Component
//开启Feign客户端功能
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBack.class)
//SPRINGCLOUD-PROVIDER-DEPT为服务端应用名称,后者服务降级

public interface DeptClientService {
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);
    @GetMapping("/dept/list")
    public List<Dept> queryAll();
}
