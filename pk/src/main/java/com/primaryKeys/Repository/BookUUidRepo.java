package com.primaryKeys.Repository;

import com.primaryKeys.model.BookUUID2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookUUidRepo extends JpaRepository<BookUUID2, UUID> {
}
