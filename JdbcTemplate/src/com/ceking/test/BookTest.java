package com.ceking.test;

import com.ceking.entity.Book;
import com.ceking.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 21:15
 */
public class BookTest {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //Book book =new Book(26,"骑士",2000,"王大大",12,21,"static/img/default.jpg");
        //int i = bookService.addBook(book);
        //System.out.println(i);
        //bookService.update(book);
        //bookService.delete(26);
//        int count = bookService.getCount();
//        System.out.println(count);

        //Book book1 = bookService.queryForObj(25);
        //System.out.println(book1);

//        List<Book> books = bookService.queryForList();
//        System.out.println(books);

        //批量添加
//        List<Object[]> list= new ArrayList<>();
//        Object[] o1= {"骑士1",1,"王大大",12,21,"static/img/default.jpg"};
//        Object[] o2= {"骑士2",2,"王大大",12,21,"static/img/default.jpg"};
//        Object[] o3= {"骑士3",3,"王大大",12,21,"static/img/default.jpg"};
//        Object[] o4= {"骑士4",4,"王大大",12,21,"static/img/default.jpg"};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        list.add(o4);
//
//        bookService.addBatch(list);

//        List<Object[]> list= new ArrayList<>();
//        Object[] o1= {"骑士1",99,"王大大",12,21,"static/img/default.jpg",27};
//        Object[] o2= {"骑士2",99,"王大大",12,21,"static/img/default.jpg",28};
//        Object[] o3= {"骑士3",99,"王大大",12,21,"static/img/default.jpg",29};
//        Object[] o4= {"骑士4",99,"王大大",12,21,"static/img/default.jpg",30};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        list.add(o4);
//        bookService.updateBatch(list);

        List<Object[]> list= new ArrayList<>();
        Object[] o1= {27};
        Object[] o2= {28};
        Object[] o3= {29};
        Object[] o4= {30};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        bookService.deletBatch(list);
    }

}
