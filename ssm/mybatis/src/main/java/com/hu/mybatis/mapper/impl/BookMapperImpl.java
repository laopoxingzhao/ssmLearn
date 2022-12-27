package com.hu.mybatis.mapper.impl;

import com.hu.mybatis.Util.SqlSessionUtil;
import com.hu.mybatis.mapper.BookMapper;
import com.hu.mybatis.pojo.Book;
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
        String one = session.selectOne("com.hu.mybatis.mapper.BookMapper.getName", null);
        session.close();
        return one;
    }

    @Override
    public Book getBook(String name) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        Book book = session.selectOne("com.hu.mybatis.mapper.BookMapper.getBook", name);
        session.close();
        return book;
    }
}
