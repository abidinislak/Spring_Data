package com.jpaQuery.repository;

import com.jpaQuery.model.Author;
import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import java.util.Optional;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface AuthorRepo extends JpaRepository<Author, Long> {


    Optional<Author> findByFirstNameAndLastName(String firstname, String lastname);


    Author test(@Param("title") String title);

    @Query(value = "SELECT * FROM Author where title= :title", nativeQuery = true)
    Author customNativeQuery(@Param("title") String title);

    @Query("SELECT A FROM Author WHERE A.name= :title")
    Author customQuery(@Param("title") String name);

    @Query("SELECT A FROM Author WHERE A.name= ?1")
    Author customQuery2(String name);

    Stream<Author> findAllByTitleNotNull();


    @Async
    Future<Author> queryBytitle(String title);

    @Nullable
    Author getnullabale(@Nullable String name);
}
