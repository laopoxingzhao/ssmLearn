package com.hu.Spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;


/**
 * @Component：将类标识为普通组件 @Controller：将类标识为控制层组件 @Service：将类标
 * 识为业务层组件 @Repository：将类标识为持久层组件
 */
//@ComponentScans()扫描
@Component("Onebook")
@PropertySource("classpath:db.properties")//读取文件
public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", user=" + user +
                '}';
    }

    private  Integer id;

    @Value("20")
    public void setId(Integer id) {
        this.id = id;
    }

    public Book() {
    }

    @Value("${book.name}")//db.properties
    private String Name;

    @Autowired   //先byType，后byName装入
    @Qualifier("user")//当一个接口有多个实现的时候，为了指名具体调用哪个类的实现
    private User user;
    //@Autowired+@Qualifier("user") == @Resource(name = "user")

    public Book(Integer id, String name, User user) {
        this.id = id;
        Name = name;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }


    public String getbOOKName() {
        return Name;
    }

    public void setBOokName(String name) {
        Name = name;
    }
}
