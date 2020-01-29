package com.pose.ssm;

import com.pose.webssm.dao.UserDao;
import com.pose.webssm.entity.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class Test {


    @Autowired
    private UserDao userDao;

    @org.junit.Test
    public void test(){
        List<User> users= userDao.findAll();
        System.out.println(users);
    }

}
