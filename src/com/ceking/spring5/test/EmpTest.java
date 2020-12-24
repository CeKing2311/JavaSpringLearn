package com.ceking.spring5.test;

import com.ceking.spring5.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:44
 */
public class EmpTest {
    @Test
    public  void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
