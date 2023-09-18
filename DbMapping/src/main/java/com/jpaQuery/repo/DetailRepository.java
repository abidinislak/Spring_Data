package com.jpaQuery.repo;

import com.jpaQuery.model.onetoone.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {
}