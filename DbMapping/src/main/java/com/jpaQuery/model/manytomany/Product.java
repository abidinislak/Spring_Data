package com.jpaQuery.model.manytomany;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ack;


    @ManyToMany
    @JoinTable(name = "product_category", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Category> produCategories;
}
