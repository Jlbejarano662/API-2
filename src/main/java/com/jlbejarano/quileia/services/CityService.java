package com.jlbejarano.quileia.services;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.City;

public interface CityService {
    
    List<City> findAll();

    Optional<City> findById(Long id);

    City save(City city);

    City update(City city);

    Boolean delete(Long id);

}
