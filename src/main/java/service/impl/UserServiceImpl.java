package service.impl;

import dao.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertByObject(User user) {
        this.userMapper.insertByObject(user);
    }

    @Override
    public User findByName(String name) {
        return this.userMapper.findByName(name);
    }
}
