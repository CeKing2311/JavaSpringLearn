package com.ceking.springdemo1;

import java.util.List;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 15:09
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
