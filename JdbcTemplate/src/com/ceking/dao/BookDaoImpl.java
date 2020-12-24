package com.ceking.dao;

import com.ceking.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 21:02
 */
@Component
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addBook(Book book) {
        String sql=" insert into t_book(name,price,author,sales,stock,img_path) values (?,?,?,?,?,?) ";
        int count = jdbcTemplate.update(sql, book.getName(), book.getPrice(), book.getAuthor(), book.getSales(), book.getStock(), book.getImgPath());
        return count;
    }

    @Override
    public void update(Book book) {
        String sql = " update t_book set name=?,price=?,author=?,sales=?,stock=?,img_path=? where id=?";
        int count = jdbcTemplate.update(sql, book.getName(), book.getPrice(), book.getAuthor(), book.getSales(), book.getStock(), book.getImgPath(), book.getId());
    }

    @Override
    public void delete(int id) {
        String  sql = "delete from t_book where id =?";
        int count = jdbcTemplate.update(sql, id);

    }
    @Override
    public int getCount(){
        String sql =" select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return  count;
    }

    @Override
    public Book queryForObj(int id) {
        String sql ="select id,name,price,author,sales,stock,img_path imgPath from t_book where id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class) ,id);
        return book;
    }

    @Override
    public List<Book> queryForList() {
        String sql ="select id,name,price,author,sales,stock,img_path imgPath from t_book ";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void addBatch(List<Object[]> books) {
        String sql = " insert into t_book(name,price,author,sales,stock,img_path) values (?,?,?,?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, books);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void updateBatch(List<Object[]> books) {
        String sql = " update t_book set name=?,price=?,author=?,sales=?,stock=?,img_path=? where id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, books);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void deleteBatch(List<Object[]> books) {
        String  sql = "delete from t_book where id =?";
        int[] ints = jdbcTemplate.batchUpdate(sql, books);
        System.out.println(Arrays.toString(ints));
    }
}
