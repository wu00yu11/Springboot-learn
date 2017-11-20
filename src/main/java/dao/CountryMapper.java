package dao;

import model.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMapper {
     Country getCountryByName(Country country);
}
