package com.dao.dao;

import com.dao.model.dao.Book;

public interface BookDao {


    Book getByID(Integer id);


    Book getByName(String name);

    Book saveBook(Book book);

    Book update(Book book) ;
    void delete(Integer id);
}
