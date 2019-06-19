package com.mybatictest.demo.service;

import com.mybatictest.demo.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpService {
    List<Emp> get(@Param(value = "id") Integer id);
}
