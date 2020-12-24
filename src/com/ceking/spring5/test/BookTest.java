package com.ceking.spring5.test;

import com.ceking.spring5.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:04
 */
public class BookTest {

    @Test
    public void testBook1() {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.see();
    }
}