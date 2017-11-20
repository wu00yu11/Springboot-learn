package dao;

import model.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMapper {
     City getCountryByName(City city);
}
