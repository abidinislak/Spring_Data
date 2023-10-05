package com.primaryKeys.model.ankara;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ankara {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)


    private int id;


    private String title;

    private String someText;


    private String tarnsientprop;
    @Transient
    private String anothertarnsientprop;


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


