package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IUserService;

@RestController("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/findUser")
    public User findUser(){
       return userService.findByName("");
    }
}
