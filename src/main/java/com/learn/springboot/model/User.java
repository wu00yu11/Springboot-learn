package com.learn.springboot.model;

import lombok.Data;

/**
 * @author jingjing.zhang
 */
@Data
public class User {
    private Long id;

    private String userName;
    private String passWord;
    private String userType;
    private String enabled;
    private String realName;
    private String qq;
    private String email;
    private String tel;
}