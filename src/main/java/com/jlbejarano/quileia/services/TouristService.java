package com.jlbejarano.quileia.services;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.Tourist;

public interface TouristService {
    
    List<Tourist> findAll();

    Optional<Tourist> findById(Long id);

    Tourist save(Tourist tourist);

    Tourist update(Tourist tourist);

    Boolean delete(Long id);

}
