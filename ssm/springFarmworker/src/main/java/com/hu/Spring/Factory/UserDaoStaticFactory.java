package com.hu.Spring.Factory;

import com.hu.Spring.Dao.UserDao;
import com.hu.Spring.Dao.impl.UserDaoImpl;

public class UserDaoStaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
