package com.jlbejarano.quileia.services.implementation;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.City;
import com.jlbejarano.quileia.repositories.CityRepository;
import com.jlbejarano.quileia.services.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);
    
    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City update(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Boolean delete(Long id) {
        try {
            cityRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            return false;
        }
    }
    
}
