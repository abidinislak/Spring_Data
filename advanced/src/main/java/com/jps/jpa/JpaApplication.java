package com.jps.jpa;


import com.jps.jpa.model.Car;
import com.jps.jpa.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaApplication  implements CommandLineRunner {


	@Autowired
	CarRepo carRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


//		List<Car> list= Arrays.asList(new Car("volvo"),new Car("bmw"),new Car("audi"));
//
//		list.forEach(x->carRepo.save(x));
//		System.err.println(carRepo.findAll().size());

	}
}
