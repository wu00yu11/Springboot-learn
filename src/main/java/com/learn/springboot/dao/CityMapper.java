package com.learn.springboot.dao;

import com.learn.springboot.model.City;
import org.springframework.stereotype.Repository;

/**
 * @author jingjing.zhang
 */
@Repository
public interface CityMapper {
     City getCityById(City city);
}
