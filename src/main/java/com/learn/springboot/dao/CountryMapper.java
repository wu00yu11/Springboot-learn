package com.learn.springboot.dao;

import com.learn.springboot.model.Country;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface CountryMapper {
     Country getCountryById(Country country);
}
