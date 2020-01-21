package com.major.simple.service;

import com.major.simple.dto.UserDtoFactory;
import com.major.simple.form.UserForm;
import com.major.simple.dao.UserDao;
import com.major.simple.mapper.RuleDOMapper;
import com.major.simple.model.RuleDO;
import com.major.simple.model.User;
import com.major.simple.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    //这是JPA的
    @Autowired
    private UserDao userDao;

    //这是Mybatis
    @Autowired
    private RuleDOMapper ruleDOMapper;

    public User findUserByName(String name) {

        //TODO业务处理
        //Dao只与数据库打交道
        User user= userDao.findByName(name);

        return user;
    }

    /**
     * 增删改加上 @Transactional 这个注解
     * 接受前端请求数据的类取名后缀为Form
     * 后端返回出去的叫做 VO
     * 实体类是DO
     * @param userForm
     */
    @Transactional
    public UserVO insertIntoUser(UserForm userForm) {

        User user = new User();
        user.setName(userForm.getUserName());
        //userDao.save(user);

        UserVO vo = new UserVO();
        return vo;
    }

    /**
     *  VO
     * @param id
     * @return
     */
    public UserVO findById(Long id) {

        RuleDO ruleDO = ruleDOMapper.selectByPrimaryKey(id);

        User user = new User();

        UserVO vo = UserDtoFactory.userVO(user);

        return vo;
    }
}
