package dao;

import model.Country;
import org.springframework.stereotype.Repository;

public interface CountryDao {
     Country getCountryByName(Country country);
}
