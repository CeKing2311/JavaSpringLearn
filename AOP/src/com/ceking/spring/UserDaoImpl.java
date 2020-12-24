package com.ceking.spring;

import com.sun.org.apache.regexp.internal.REUtil;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 17:11
 */
public class UserDaoImpl implements  UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add 方法被执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        return  id;
    }
}
