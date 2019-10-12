package com.changhong.spring.service;

import com.changhong.spring.bean.Employee;
import com.changhong.spring.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


/**
 * @date:2019/10/11 15:45
 * @author:lilair
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Cacheable(cacheNames = "temcache")
    public Employee getEmpById(Integer id){
        System.out.println("查询"+id+"号雇员！！！！！！！");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }
}
