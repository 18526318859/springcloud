package com.cloud.dao.Impl;

import com.cloud.dao.DeptDao;
import com.cloud.pojo.Dept;
import com.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept ( dept );
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById ( id );
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll ();
    }
}
