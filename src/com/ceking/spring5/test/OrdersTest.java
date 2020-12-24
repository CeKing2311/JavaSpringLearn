package com.ceking.spring5.test;

import com.ceking.spring5.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:15
 */
public class OrdersTest {
    @Test
    public  void  test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        orders.showOrder();
    }
}