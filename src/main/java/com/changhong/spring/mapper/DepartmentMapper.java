package com.changhong.spring.mapper;

import com.changhong.spring.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @date:2019/10/11 14:46
 * @author:lilair
 */
@Mapper
public interface DepartmentMapper {
    @Insert("insert into department values(#{departmentName})")
    void save(Department department);
    @Delete("delete from department where id=#{id}")
    void delete(Integer id);
    @Select("select * from department where id=#{id}")
    Department findById(Integer id);
    @Update("update department set departmentName=#{departmentName}")
    void update(Department department);
}
