package com.ceking.spring5.entity;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:39
 */
public class Dept {
    private  String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
