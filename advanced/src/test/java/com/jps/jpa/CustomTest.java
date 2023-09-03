package com.jps.jpa;


import com.jps.jpa.repo.CarRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CustomTest {

    @Autowired
    CarRepo carRepo;


    @Test
    public void testCount(){


        System.err.println(carRepo.count());

        assertThat(carRepo.count()).isGreaterThan(0);

    }
}
