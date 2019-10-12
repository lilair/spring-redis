package com.changhong.spring.service;

import com.changhong.spring.bean.Department;
import com.changhong.spring.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @date:2019/10/11 15:28
 * @author:lilair
 */
@Service
public class DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    public Department findById(Integer id){
        Department department = departmentMapper.findById(id);
        return department;
    }
}
