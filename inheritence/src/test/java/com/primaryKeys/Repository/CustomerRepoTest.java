package com.primaryKeys.Repository;

import com.primaryKeys.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerRepoTest {


    @Autowired
    CustomerRepo customerRepo;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSAve() {


        Customer customer = new Customer();
        customer.setName("test ankare.................");


        customerRepo.save(customer);


    }

}