package com.jpaQuery.config;


import com.jpaQuery.model.Customer;
import com.jpaQuery.repo.CustomerRepo;
import com.jpaQuery.repo.OrderHeaderRepo;
import com.jpaQuery.service.BootstrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class Bootstrap implements CommandLineRunner {

    @Autowired
    BootstrapService bootstrapService;


    @Autowired
    CustomerRepo customerRepo;
    private OrderHeaderRepo orderHeaderRepo;


    ///////         dosent work internallly
//    @Transactional
//
//    public void readData() {
//
//        System.err.println("Lets start......");
//        System.err.println("/////////////////////////");
//
//        OrderHeader orderHeader = orderHeaderRepo.findById(1).get();
//
//        orderHeader.getOrderLines().forEach(ol -> {
//            System.err.println(ol.getProduct().getName());
//            ol.getProduct().getCategories().forEach(cat -> System.err.println(cat.getName() + ".....cat..."));
//        });
//
//
//    }


    @Override
    public void run(String... args) throws Exception {

//        bootstrapService.readData();


//        Customer customer = new Customer();
//        customer.setName("Testing Version");
//        Customer savedCustomer = customerRepo.save(customer);
//        System.out.println("Version is: " + savedCustomer.getVersion());
//
//        savedCustomer.setName("Testing Version 2");
//        customerRepo.save(savedCustomer);
//        System.err.println("version is " + savedCustomer.getVersion());
//        savedCustomer.setName("testing verison 3");
//        customerRepo.save(savedCustomer);
//        System.err.println("version is" + savedCustomer.getVersion());


//        customerRepo.delete(savedCustomer3);

        Customer customer = new Customer();
        customer.setName("Testing Version");
        Customer savedCustomer = customerRepo.save(customer);
        System.out.println("Version is: " + savedCustomer.getVersion());

        savedCustomer.setName("Testing Version 2");
        Customer savedCustomer2 = customerRepo.save(savedCustomer);
        System.out.println("Version is: " + savedCustomer2.getVersion());

        savedCustomer2.setName("Testing Version 3");
        Customer savedCustomer3 = customerRepo.save(savedCustomer2);
        System.out.println("Version is: " + savedCustomer3.getVersion());

//        customerRepo.delete(savedCustomer);
        customerRepo.delete(savedCustomer3);


    }
}
