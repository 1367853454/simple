package com.major.simple.service;

import com.major.simple.dao.UserDao;
import com.major.simple.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserByName(String name) {

        User user= userDao.findByName(name);
        return user;
    }
}
