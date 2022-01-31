package com.jlbejarano.quileia.repositories;

import com.jlbejarano.quileia.entities.Tourist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends  JpaRepository<Tourist, Long> {
}
