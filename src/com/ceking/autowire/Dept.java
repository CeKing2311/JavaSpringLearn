package com.ceking.autowire;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 15:52
 */
public class Dept {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
