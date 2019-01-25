package com.learn.springboot.service.impl;

import com.learn.springboot.dao.UserMapper;
import com.learn.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learn.springboot.service.IUserService;
/**
 * @author jingjing.zhang
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(User user) {
        return this.userMapper.getUserById(user);
    }
}
