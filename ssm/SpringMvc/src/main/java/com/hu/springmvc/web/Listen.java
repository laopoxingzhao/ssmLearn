package com.hu.springmvc.web;

import com.hu.springmvc.Config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listen implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ApplicationContext a = new AnnotationConfigApplicationContext(Config.class);
        sce.getServletContext().setAttribute("app",a);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
