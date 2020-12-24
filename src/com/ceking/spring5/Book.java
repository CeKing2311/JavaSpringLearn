package com.ceking.spring5;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:01
 */
public class Book {
    private String name;
    private String author;
    private String address;
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void see() {
        System.out.println("正在看：" + author + "的名著：" + name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
