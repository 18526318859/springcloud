package com.cloud.service;

        import com.cloud.pojo.Dept;

        import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
