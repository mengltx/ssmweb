package com.pose.webssm.controller;

import com.pose.webssm.entity.User;
import com.pose.webssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public List<User> findUsers() {
        return userService.findUsers();
    }
}
