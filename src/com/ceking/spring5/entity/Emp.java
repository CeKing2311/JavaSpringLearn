package com.ceking.spring5.entity;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 11:39
 */
public class Emp {
    private String ename;
    private String egender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEgender(String egender) {
        this.egender = egender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", egender='" + egender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
