package com.example.yixian.controller;

import com.example.yixian.dto.Employee;
import com.example.yixian.mapper.IEmployee;
import com.example.yixian.vo.ParseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parse")
public class ParseController {

    @Autowired
    private IEmployee employeeDao;


    @RequestMapping("/vo")
    public String parse(@RequestBody ParseVo parseVo) {
        System.out.println("parseVo = " + parseVo.toString());
        return parseVo.toString();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }

    @RequestMapping("/select")
    public String selectEmployee(Integer id) {
        Employee employee = employeeDao.selectById(id);
        System.out.println("hello");
        return employee.toString();
    }

}
