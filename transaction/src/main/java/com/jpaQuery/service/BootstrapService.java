package com.jpaQuery.service;


import com.jpaQuery.model.OrderHeader;
import com.jpaQuery.repo.OrderHeaderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BootstrapService {


    @Autowired

    private OrderHeaderRepo orderHeaderRepo;


    @Transactional

    public void readData() {

        System.err.println("Lets start......");
        System.err.println("/////////////////////////");

        OrderHeader orderHeader = orderHeaderRepo.findById(1).get();

        orderHeader.getOrderLines().forEach(ol -> {
            System.err.println(ol.getProduct().getName());
            ol.getProduct().getCategories().forEach(cat -> System.err.println(cat.getName() + ".....cat..."));
        });


    }


}
