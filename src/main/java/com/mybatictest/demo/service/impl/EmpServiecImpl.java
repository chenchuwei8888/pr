package com.mybatictest.demo.service.impl;

import com.mybatictest.demo.entity.Emp;
import com.mybatictest.demo.mapper.EmpMapper;
import com.mybatictest.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiecImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override

    public List<Emp> get(Integer id) {
        return empMapper.get(id);
    }
}
