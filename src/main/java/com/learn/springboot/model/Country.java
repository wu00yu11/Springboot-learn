package com.learn.springboot.model;

import lombok.Data;

/**
 * @author jingjing.zhang
 */
@Data
public class Country {
    private Long id;
    private String countryName;
    private String countryCode;
}
