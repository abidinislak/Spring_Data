package com.jps.jpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component


public class StarterClass implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.err.println("starting starte clas........................");
    }
}
