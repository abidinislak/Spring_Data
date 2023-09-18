package com.jpaQuery.repo;

import com.jpaQuery.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepo extends JpaRepository<OrderLine, Integer> {
}
