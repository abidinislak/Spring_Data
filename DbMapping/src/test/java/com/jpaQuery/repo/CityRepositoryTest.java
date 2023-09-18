package com.jpaQuery.repo;

import com.jpaQuery.model.onetoone.City;
import com.jpaQuery.model.onetoone.Detail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CityRepositoryTest {


    @Autowired
    CityRepository cityRepository;
    @Autowired
    DetailRepository detailRepository;


    @Test
    public void test() {

        City city = new City();
        city.setAck("SADS");

        Detail detail = new Detail();
        detail.setAck("detail example");

//        Detail detail1 = detailRepository.save(detail);

        city.setDetail(detail);
        City city1 = cityRepository.save(city);
        assert city1.getDetail().getAck().equals("detail example");


    }
}