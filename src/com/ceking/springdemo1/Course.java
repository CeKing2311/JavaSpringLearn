package com.ceking.springdemo1;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 15:02
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
