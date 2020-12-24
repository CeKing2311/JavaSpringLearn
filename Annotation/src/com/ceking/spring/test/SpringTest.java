package com.ceking.spring.test;

import com.ceking.config.SpringConfig;
import com.ceking.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 16:23
 */
public class SpringTest {

    @Test
    public void testService(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testService2(){
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
