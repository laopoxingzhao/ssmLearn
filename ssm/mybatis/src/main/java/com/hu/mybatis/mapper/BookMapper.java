package com.hu.mybatis.mapper;

import com.hu.mybatis.pojo.Book;

public interface BookMapper {

    String getBookName();
    Book getBook(String name);
}
