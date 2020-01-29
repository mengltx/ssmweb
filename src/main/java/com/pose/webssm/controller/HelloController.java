package com.pose.webssm.controller;

import com.pose.webssm.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public User hello(){
        User user = new User();
        user.setId(1);
        user.setName("dubbo");
        return user;
    }
}
