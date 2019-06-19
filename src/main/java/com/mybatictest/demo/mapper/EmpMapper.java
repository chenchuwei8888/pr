package com.mybatictest.demo.mapper;

import com.mybatictest.demo.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface  EmpMapper {
    List<Emp> get(@Param(value = "id") Integer id);
}
