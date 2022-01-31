package com.jlbejarano.quileia.services.implementation;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.Tourist;
import com.jlbejarano.quileia.repositories.TouristRepository;
import com.jlbejarano.quileia.services.TouristService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TouristServiceImpl implements TouristService {
    
    @Autowired
    TouristRepository touristRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(TouristServiceImpl.class);

    @Override
    public List<Tourist> findAll() {
        return (List<Tourist>) touristRepository.findAll();
    }

    @Override
    public Optional<Tourist> findById(Long id) {
        return touristRepository.findById(id);
    }

    @Override
    public Tourist save(Tourist tourist) {
        return touristRepository.save(tourist);
    }

    @Override
    public Tourist update(Tourist tourist) {
        return touristRepository.save(tourist);
    }

    @Override
    public Boolean delete(Long id) {
        try {
            touristRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            return false;
        }
    }

}
