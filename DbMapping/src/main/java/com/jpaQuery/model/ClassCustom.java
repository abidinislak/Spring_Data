package com.jpaQuery.model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class ClassCustom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ack;
    @OneToMany(mappedBy = "classCustom", cascade = CascadeType.MERGE)
    private Set<Student> students;


    public ClassCustom(String ack) {
        this.ack = ack;
    }

    public ClassCustom() {
    }

    public void addStudent(Student student) {
        if (students == null) {

            students = new HashSet<>();

        }

        students.add(student);

        student.setClassCustom(this);

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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
