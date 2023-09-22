package com.jpaQuery.repo;

import com.jpaQuery.model.Product;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
//    have to make transaction at impelemntion
    Optional<Product> findById(Integer integer);
}
