package com.primaryKeys.Repository;

import com.primaryKeys.model.CarUUID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarUUIDRepository extends JpaRepository<CarUUID, UUID> {
}
