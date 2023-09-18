package com.jpaQuery.model;


import jakarta.persistence.*;

@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String name;
    @Version
    private int version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
