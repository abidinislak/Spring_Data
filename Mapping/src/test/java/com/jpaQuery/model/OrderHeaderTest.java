package com.jpaQuery.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderHeaderTest {

    @Test
    public void test() {


        OrderHeader test1 = new OrderHeader();
        test1.setId(1L);
        OrderHeader test2 = new OrderHeader();
        test2.setId(1L);


        assert test1.equals(test2);

    }

}