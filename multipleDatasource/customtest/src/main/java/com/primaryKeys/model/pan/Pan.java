package com.primaryKeys.model.pan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pan {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)


    private int id;


    private String title;

    private String someText;

}


