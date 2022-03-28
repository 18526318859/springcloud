package com.cloud.service;

import com.cloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//降级
public class DeptClientServiceFallBack implements FallbackFactory{
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService ( ) {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept ().setDeptno ( id )
                        .setDname ( "该id由于客户端服务降级，服务器端已关闭，未找到信息" )
                        .setDb_source ( "No Found DataSource" );
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
