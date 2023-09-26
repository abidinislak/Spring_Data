package com.primaryKeys.Repository;

import com.primaryKeys.model.BookNatural;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookNatural, String> {
}
