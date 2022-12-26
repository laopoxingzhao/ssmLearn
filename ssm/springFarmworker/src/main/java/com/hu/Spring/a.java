package com.hu.Spring;

import com.hu.Spring.Controller.UserControl;
import com.hu.Spring.Dao.UserDao;
import com.hu.Spring.Dao.impl.UserDaoImpl;
import com.hu.Spring.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class a {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserControl user = (UserControl)applicationContext.getBean("userControl");
        System.out.println(user);
    }
}
