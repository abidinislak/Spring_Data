package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;

@Entity
@Immutable
@Table(name = "birlik")
public class Birlik {

    @Id
    private Long brlkod;

    private String brladi;

    public Long getBrlkod() {
	return brlkod;
    }

    public String getBrladi() {
	return brladi;
    }

    public Birlik() {

    }

}
