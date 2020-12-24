package com.ceking.service;

import com.ceking.dao.BookDao;
import com.ceking.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 21:02
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao booDao;

    public int addBook(Book book){
        return  booDao.addBook(book);
    }
    public void update(Book book){
        booDao.update(book);
    }
    public void  delete(int id){
        booDao.delete(id);
    }
    public int getCount(){
        return  booDao.getCount();
    }
    public Book queryForObj(int id){
        return booDao.queryForObj(id);
    }
    public List<Book> queryForList(){
        return booDao.queryForList();
    }
    public void addBatch(List<Object[]> args ){
         booDao.addBatch(args);
    }
    public void updateBatch(List<Object[]> books){
        booDao.updateBatch(books);
    }
    public void deletBatch(List<Object[]> books){
        booDao.deleteBatch(books);
    }

}
