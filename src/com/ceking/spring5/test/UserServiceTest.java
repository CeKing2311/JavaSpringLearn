package com.ceking.spring5.test;

import com.ceking.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:35
 */
public class UserServiceTest {

    @Test
    public void test() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}