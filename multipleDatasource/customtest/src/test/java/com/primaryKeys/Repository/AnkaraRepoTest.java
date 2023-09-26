package com.primaryKeys.Repository;

import com.primaryKeys.Repository.ankara.AnkaraRepo;
import com.primaryKeys.model.ankara.Ankara;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnkaraRepoTest {


    @Autowired
    AnkaraRepo ankaraRepo;


    @Test
    public void testStarter() {


        Ankara ankara = new Ankara();

        ankara.setTitle("tset starrer");

        ankaraRepo.save(ankara);
    }

}