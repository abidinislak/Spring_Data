package com.jpaQuery.model;


import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ack;
    @ManyToOne
    private ClassCustom classCustom;

    public Student(String ack) {
        this.ack = ack;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public ClassCustom getClassCustom() {
        return classCustom;
    }

    public void setClassCustom(ClassCustom classCustom) {
        this.classCustom = classCustom;
    }
}
