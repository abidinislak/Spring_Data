package com.jpaQuery.repository;

import com.jpaQuery.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorRepoTest {


    @Autowired
    AuthorRepo authorRepo;
@Test
void furuteTes(){

    Future<Author> bookFuture=authorRepo.queryBytitle("clean code");

assertNotNull(bookFuture);
}
    @Test
    void streamTest(){

        AtomicInteger count=new AtomicInteger();
        authorRepo.findAllByTitleNotNull().forEach(x->count.incrementAndGet());

        assertThat(count.get()).isGreaterThan(2);



    }

}