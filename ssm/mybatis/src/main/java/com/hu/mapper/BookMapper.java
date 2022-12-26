package com.hu.mapper;

import com.hu.pojo.Book;

public interface BookMapper {

    String getBookName();
    Book getBook(String name);
}
