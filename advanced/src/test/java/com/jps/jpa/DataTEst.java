package com.jps.jpa;


import com.jps.jpa.model.Car;
import com.jps.jpa.repo.CarRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;


//@RunWith(SpringRunner.class)
import java.util.Arrays;
import java.util.List;
@DataJpaTest
//@Rollback(value = false)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestPropertySource(properties = {
        "spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/ankara"
})
public class DataTEst {

    @Autowired
    CarRepo carRepo;


    @Test
    public void testlight() {

        System.err.println(carRepo.count());

		List<Car> list= Arrays.asList(new Car("hhh"),new Car("hhh"),new Car("hh"));

		list.forEach(x->carRepo.save(x));
		System.err.println(carRepo.findAll().size());
//        carRepo.save(new Car("asdasdas"));


    }
}
