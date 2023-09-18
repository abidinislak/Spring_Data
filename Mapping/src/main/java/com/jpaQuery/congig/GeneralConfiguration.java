package com.jpaQuery.congig;

import com.jpaQuery.model.Author;
import com.jpaQuery.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class GeneralConfiguration {


    @Autowired
    AuthorRepo authorRepo;


    @Bean
    public CommandLineRunner getinitialzeDb() {


        return args -> {

            List<Author> list = Arrays.asList(new Author("asd", "qweqw"), new Author("Abidin", "IŞLAK"), new Author("567567", "22"), new Author("cc", "bbb"), new Author("fdfg", "as"));


            list.forEach(x -> authorRepo.save(x));

        };


    }
}
