package com.learn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingjing.zhang
 */
@Configuration
@MapperScan("com.learn.springboot.dao")
public class MyBatisConfig {
}