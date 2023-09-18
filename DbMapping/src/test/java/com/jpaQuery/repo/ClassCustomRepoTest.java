package com.jpaQuery.repo;


import com.jpaQuery.model.ClassCustom;
import com.jpaQuery.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
class ClassCustomRepoTest {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    ClassCustomRepo classCustomRepo;


    Student student;

    ClassCustom classCustom;


    @BeforeEach
    public void setClassCustom() {

        classCustom = new ClassCustom("asdwsa");

    }

    @BeforeEach
    public void studentExample() {
        student = studentRepo.save(new Student("asdas"));


    }

    @Test
    public void test() {


        ClassCustom entity = new ClassCustom("test clas custom save");


        entity.setStudents(Set.of(student));
        student.setClassCustom(entity);
        ClassCustom customSaved = classCustomRepo.save(entity);
        studentRepo.save(student);
        classCustomRepo.flush();


        assert customSaved.getId() > 0;


    }
}