package com.jps.jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Car {
    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String name;
}
