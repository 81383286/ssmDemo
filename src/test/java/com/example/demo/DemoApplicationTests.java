package com.example.demo;


import com.emr.entity.Power_Role;
import com.emr.service.PowerRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/applicationContext.xml"})
public class DemoApplicationTests {
    @Autowired
    private PowerRoleService powerRoleService;
    @Test
    public void contextLoads() {
        List<Power_Role> list = powerRoleService.selectAll();
        System.out.println(list.toString());
    }
}
