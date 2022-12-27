package com.hu.Spring;

import com.hu.Spring.domain.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class a {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Book user = (Book)applicationContext.getBean("Onebook");
        System.out.println(user);
    }
}
