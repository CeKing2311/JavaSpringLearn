package com.ceking.spring5.service;

import com.ceking.spring5.dao.UserDao;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:28
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add ...");
        userDao.update();
    }
}
