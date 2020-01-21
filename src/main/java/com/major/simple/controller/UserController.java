package com.major.simple.controller;

import com.major.simple.model.User;
import com.major.simple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/index")
    /*@PostMapping
    @PutMapping
    @DeleteMapping
    @GetMapping*/
    /**
     * 查询get
     * 新增post
     * 修改put
     * 删除delete
     */
    public User index(){

        //TODO数据处理
        return userService.findUserByName(new String("admin"));
    }

}
