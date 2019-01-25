package com.learn.springboot.dao;

import com.learn.springboot.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface UserMapper {
    User getUserById(User user);
}
