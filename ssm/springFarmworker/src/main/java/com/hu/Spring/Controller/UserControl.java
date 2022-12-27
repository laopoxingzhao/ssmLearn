package com.hu.Spring.Controller;

import com.hu.Spring.Dao.UserDao;

public class UserControl {
    private UserDao userDao;

    private String name;


    public UserControl() {
    }
    public UserControl(UserDao userDao, String name) {
        this.userDao = userDao;
        this.name = name;
    }
    public UserDao getUserDao() {
        return userDao;
    }




    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "UserControl{" +
                "userDao=" + userDao +
                ", name='" + name + '\'' +
                '}';
    }


}
