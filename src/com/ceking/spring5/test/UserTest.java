package com.ceking.spring5.test;

import com.ceking.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 10:13
 */
public class UserTest {
    @Test
    public void say() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.say();
    }
}