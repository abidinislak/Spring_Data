package com.primaryKeys.Repository.ankara;

import com.primaryKeys.Repository.pan.PanRepo;
import com.primaryKeys.model.ankara.Ankara;
import com.primaryKeys.model.pan.Pan;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnkaraRepoTest {


    @Autowired
    AnkaraRepo ankaraRepo;

    @Autowired
    PanRepo panRepo;


    @Test
    public void test() {


        Ankara ankara = new Ankara();
        ankara.setTitle("sadas");

        ankaraRepo.save(ankara);


        Pan pan = new Pan();
        pan.setTitle("1wqwqdqweqwe");

        panRepo.save(pan);


    }


}