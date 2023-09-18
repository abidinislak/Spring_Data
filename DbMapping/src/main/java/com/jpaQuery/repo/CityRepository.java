package com.jpaQuery.repo;

import com.jpaQuery.model.onetoone.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}