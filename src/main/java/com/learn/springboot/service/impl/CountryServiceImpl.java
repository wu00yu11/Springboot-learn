package com.learn.springboot.service.impl;

import com.learn.springboot.dao.CountryMapper;
import com.learn.springboot.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learn.springboot.service.ICountryService;
@Service("countryService")
public class CountryServiceImpl implements ICountryService {
    @Autowired
    private CountryMapper countryMapper;
    @Override
    public Country getCountryById(Country country) {
        return this.countryMapper.getCountryById(country);
    }
}
