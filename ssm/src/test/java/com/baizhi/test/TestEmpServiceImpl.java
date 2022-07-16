package com.baizhi.test;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import com.baizhi.service.EmpServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestEmpServiceImpl {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmpService bean = (EmpService) context.getBean("empServiceImpl");
       /* bean.save(new Emp(2 ,"xa io",new Date(),23.23));*/
       bean.findAll().forEach(emp -> {System.out.println(emp);});

    }
}
