package com.changhong.spring;

import com.changhong.spring.bean.Department;
import com.changhong.spring.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRedisApplicationTests {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void test01(){
        redisTemplate.opsForSet().add("list",1);
        redisTemplate.opsForSet().add("list",2);
        Set members = redisTemplate.opsForSet().members("list");
        System.out.println(members);
        redisTemplate.opsForValue().set("name","lilair");
        Object name = redisTemplate.opsForValue().get("str");
        System.out.println(name);
    }

    @Test
    public void contextLoads() {
        Department department = departmentMapper.findById(1);
        System.out.println(department);
    }

}
