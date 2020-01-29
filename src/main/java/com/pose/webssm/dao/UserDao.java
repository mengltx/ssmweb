package com.pose.webssm.dao;

import com.pose.webssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {


    void addUser(User user);

    List<User> findAll();
}
