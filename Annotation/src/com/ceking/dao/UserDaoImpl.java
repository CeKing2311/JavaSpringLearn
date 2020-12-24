package com.ceking.dao;

import org.springframework.stereotype.Repository;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 16:38
 */

@Repository(value = "userDaoImp1")
public class UserDaoImpl implements  UserDao {
    @Override
    public void add() {
        System.out.println(" userdao add ...");
    }
}
