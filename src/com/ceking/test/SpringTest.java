package com.ceking.test;

import com.ceking.autowire.Emp;
import com.ceking.springdemo1.Book;
import com.ceking.springdemo1.Course;
import com.ceking.springdemo1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 14:46
 */
public class SpringTest {

    @Test
    public void testStudent() {
        ApplicationContext context =new ClassPathXmlApplicationContext("beandemo1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        student.showCourses();
    }
    @Test
    public void  testBook(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beandemo2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
    @Test
    public void  testMyBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beanfactory.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }
    @Test
    public void  testAutowire(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beanautowire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }


}