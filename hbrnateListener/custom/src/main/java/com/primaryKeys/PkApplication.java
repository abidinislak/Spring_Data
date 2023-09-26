package com.primaryKeys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PkApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
