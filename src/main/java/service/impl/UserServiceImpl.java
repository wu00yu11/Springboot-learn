package service.impl;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(String name) {
        User user= new User();
        user.setId("1");
        return this.userDao.getUserById(user);
    }
}
