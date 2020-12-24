package com.ceking.spring.aopanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 19:58
 */
public class UserProxyTest {
    @Test
    public void test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
