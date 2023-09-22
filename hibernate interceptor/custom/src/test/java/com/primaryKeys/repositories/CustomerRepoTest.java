package com.primaryKeys.repositories;


import com.primaryKeys.domain.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    @Test
    public void testSave() {


        Customer customer = new Customer();

        customer.setName("test ınteceptor");

        customerRepo.save(customer);

    }


}