package com.ceking.autowire;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 15:52
 */
public class Emp {
    private  Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
