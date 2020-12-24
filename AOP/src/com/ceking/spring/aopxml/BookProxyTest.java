package com.ceking.spring.aopxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 20:32
 */
public class BookProxyTest {
    @Test
    public void  test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
