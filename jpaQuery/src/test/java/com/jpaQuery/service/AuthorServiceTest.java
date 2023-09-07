package com.jpaQuery.service;

import com.jpaQuery.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AuthorServiceTest {

    @Autowired
    AuthorService authorService;


    @Test
    public void findByFirstNameAndLastNameTest(){


        Author fetchAuthor=authorService.findByFirstNameAndLastName("Abidinn","IŞLAK");

        assertThat(fetchAuthor).isNotNull();




    }

}