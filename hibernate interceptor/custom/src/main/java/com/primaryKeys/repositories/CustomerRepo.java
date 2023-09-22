package com.primaryKeys.repositories;

import com.primaryKeys.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
