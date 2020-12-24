package com.ceking.service;

import com.ceking.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
 *@author ceking
 *@description 用注解的方式创建对象
 * 默认值是类名称，首字母小写
 *@date 2020-12-24 16:26
 */

@Service(value = "userService")
public class UserService {

    //1.@Autowired 根据类型进行注入
    //2.@Qualifier 与 @Autowired 配合使用，根据名称注入
//    @Autowired
//    @Qualifier(value = "userDaoImp1")
//    private UserDao userDao;

    //3.@Resource根据类型注入
//    @Resource
    @Resource(name = "userDaoImp1")
    private UserDao userDao;
    public void add() {
        System.out.println("service add ...");
        userDao.add();
    }
}
