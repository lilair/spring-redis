package com.changhong.spring;

import com.changhong.spring.bean.Department;
import com.changhong.spring.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRedisApplicationTests {
    @Autowired
    DepartmentMapper departmentMapper;
    @Test
    public void contextLoads() {
        Department department = departmentMapper.findById(1);
        System.out.println(department);
    }

}
