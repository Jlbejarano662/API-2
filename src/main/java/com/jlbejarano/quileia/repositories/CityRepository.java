package com.jlbejarano.quileia.repositories;

import com.jlbejarano.quileia.entities.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends  JpaRepository<City, Long> {
}
