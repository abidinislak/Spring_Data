package com.primaryKeys.Repository;

import com.primaryKeys.model.Ankara;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnkaraRepoTest {

    @Autowired
    AnkaraRepo ankaraRepo;

    @Test
    public void testJpaCallCBack() {


        Ankara ankara = new Ankara();

        ankara.setTitle("asdasd");

        ankaraRepo.save(ankara);


    }

}