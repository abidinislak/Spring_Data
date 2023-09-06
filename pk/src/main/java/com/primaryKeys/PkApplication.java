package com.primaryKeys;

import com.primaryKeys.Repository.*;
import com.primaryKeys.model.*;
import com.primaryKeys.util.NamedId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PkApplication implements CommandLineRunner {
    @Autowired
    BookUUidRepo bookUUidRepo;
    @Autowired
    BookRepo bookRepo;


    @Autowired
    CompositeRepo compositeRepo;

    @Autowired
    CarUUIDRepository carUUIDRepository;


    @Autowired
    AuthorRepo authorRepo;
    @Autowired
    PersonIdentiyRepo personIdentiyRepo;

    public static void main(String[] args) {
        SpringApplication.run(PkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        List<PersonIdentity> list = Arrays.asList(new PersonIdentity(), new PersonIdentity());

        list.forEach(x -> personIdentiyRepo.save(x));

        personIdentiyRepo.findAll().forEach(x -> System.err.println(x.getId()));

        System.err.println("//////// uuid s////////////////");
        List<CarUUID> list2 = Arrays.asList(new CarUUID(), new CarUUID(), new CarUUID());

        list2.forEach(x -> carUUIDRepository.save(x));

        carUUIDRepository.findAll().forEach(x -> System.err.println(x.getId()));
        System.err.println("///// uuuid 2");


        List<BookUUID2> list3 = Arrays.asList(new BookUUID2(), new BookUUID2(), new BookUUID2(), new BookUUID2(), new BookUUID2());

        list3.forEach(x -> bookUUidRepo.save(x));


//        natural key test


        List<BookNatural> listnatural = Arrays.asList(new BookNatural("first natural"), new BookNatural("first naturasdasdasdasdal"), new BookNatural("first naturalasd"));

        listnatural.forEach(x -> bookRepo.save(x));
// composite id


        NamedId var = new NamedId("abidin", "isik");

        Composite var2 = new Composite();
        var2.setName(var.getName());
        var2.setLastName(var.getLastName());

        compositeRepo.save(var2);

// embeded composite


        NamedId entity = new NamedId("adas", "wedw");

        AuthorComposite authorComposite = new AuthorComposite();
        authorComposite.setNamedId(entity);

        authorRepo.save(authorComposite);
    }
}
