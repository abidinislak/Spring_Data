package com.jpaQuery.repo;

import com.jpaQuery.model.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepo extends JpaRepository<OrderHeader, Integer> {
}
