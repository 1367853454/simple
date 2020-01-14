package com.major.simple.controller;

import com.major.simple.model.User;
import com.major.simple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public User index(){

        return userService.findUserByName(new String("admin"));
    }

}
