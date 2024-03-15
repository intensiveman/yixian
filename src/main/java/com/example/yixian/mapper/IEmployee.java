package com.example.yixian.mapper;

import com.example.yixian.dto.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IEmployee {


    @Select("select * from employee where id = #{id}")
    Employee selectById(Integer id);
}
