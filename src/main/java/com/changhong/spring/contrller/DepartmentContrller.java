package com.changhong.spring.contrller;

import com.changhong.spring.bean.Department;
import com.changhong.spring.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date:2019/10/11 15:32
 * @author:lilair
 */
@RestController
public class DepartmentContrller {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/depart/{id}")
    public Department findById(@PathVariable("id") Integer id){
        Department department = departmentService.findById(id);
        return department;
    }
}
