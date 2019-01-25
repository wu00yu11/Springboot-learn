package com.learn.springboot.controller;

import com.learn.springboot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import com.learn.springboot.RunMain;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunMain.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserControllerTest{
    private static Logger log = LoggerFactory.getLogger(UserControllerTest.class);
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Test
    public void findUser() throws Exception {
        User result = testRestTemplate.getForObject("/user/findUser", User.class);
        log.info(result.toString());
    }

}