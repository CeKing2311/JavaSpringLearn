package com.ceking.dao;

import com.ceking.entity.Book;

import java.util.List;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 21:02
 */
public interface BookDao {
    //添加
    public int addBook(Book book);
    //修改
    public void update(Book book);
    //删除
    public void  delete(int id);
    //获取单个值
    public int getCount();
    //查询对象
    public Book queryForObj(int id);
    //查询对象集合
    public List<Book> queryForList();
    //批量添加
    public void addBatch(List<Object[]> books);
    //批量修改
    public void updateBatch(List<Object[]> books);
    //批量删除
    public void deleteBatch(List<Object[]> books);
}
