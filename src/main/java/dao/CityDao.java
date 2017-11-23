package dao;

import model.City;
import org.springframework.stereotype.Repository;

public interface CityDao {
     City getCountryByName(City city);
}
