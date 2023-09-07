package com.dao.model.dao;


import jakarta.persistence.*;


@NamedQueries({
        @NamedQuery(name = "book_find_all", query = "FROM Book"),
        @NamedQuery(name = "find_by_name", query = "FROM Book a WHERE a.name = :name")
})
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public Book() {
    }
}
