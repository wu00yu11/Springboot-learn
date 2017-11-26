package com.learn.springboot.controller;

import com.learn.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learn.springboot.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/findUser")
    public User findUser(){
        User user= new User();
        user.setId(1L);
        user = userService.findById(user);
       return user;
    }
}
