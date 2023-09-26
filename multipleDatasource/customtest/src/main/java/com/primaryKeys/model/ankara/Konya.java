package com.primaryKeys.model.ankara;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Konya {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)


    private int id;


    private String title;

    private String someText;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }
}
