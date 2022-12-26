package com.hu.mapper.impl;

import com.hu.Util.SqlSessionUtil;
import com.hu.mapper.BookMapper;
import com.hu.pojo.Book;
import org.apache.ibatis.session.SqlSession;



public class BookMapperImpl implements BookMapper {
//    dao层实现之传统方式
    /*
    定义 BookMapper 接口：
    定义 BookMapper 接口的实现类 BookMapperImpl ：
     */

    @Override
    public String getBookName() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        String one = session.selectOne("com.hu.mapper.BookMapper.getName", null);
        session.close();
        return one;
    }

    @Override
    public Book getBook(String name) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        Book book = session.selectOne("com.hu.mapper.BookMapper.getBook", name);
        session.close();
        return book;
    }
}
