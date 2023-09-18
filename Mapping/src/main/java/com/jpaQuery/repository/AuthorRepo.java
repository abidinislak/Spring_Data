package com.jpaQuery.repository;

import com.jpaQuery.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {

//    @Query("select *  from Author limit :page offset :size")
//    List<Author> getTest(int page, int size);


}
