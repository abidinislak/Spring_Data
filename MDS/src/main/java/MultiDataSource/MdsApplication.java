package MultiDataSource;

import MultiDataSource.orderRepo.OrderRepository;
import MultiDataSource.orderentity.Order;
import MultiDataSource.productEntity.Product;
import MultiDataSource.repository.Productepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MdsApplication implements CommandLineRunner {


    @Autowired
    Student student;
    @Autowired
    private Productepo productepo;
    @Autowired
    private OrderRepository orderRepository;

    public static void main(String[] args) {

        System.err.println("*************");
        SpringApplication.run(MdsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product();
        product.setId(45);
        product.setName("mysql test");

        product.setPrice(123123.0);
        Product product1 = productepo.save(product);


        Order order = new Order(123, "23123", new Date());

        orderRepository.save(order);
        System.err.println("*************" + product1.getId());

        System.err.println("testing student properties");
        System.err.println(student.getId());
        System.err.println(student.getName());

    }
}
