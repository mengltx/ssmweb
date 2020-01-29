package com.pose.webssm.service;

import com.pose.webssm.dao.UserDao;
import com.pose.webssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public List<User> findUsers(){
        return userDao.findAll();
    }
}
