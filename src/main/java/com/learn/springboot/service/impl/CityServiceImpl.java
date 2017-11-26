package com.learn.springboot.service.impl;

import com.learn.springboot.dao.CityMapper;
import com.learn.springboot.model.City;
import com.learn.springboot.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("cityService")
public class CityServiceImpl implements ICityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public City getCityById(City city) {
        return this.cityMapper.getCityById(city);
    }
}
