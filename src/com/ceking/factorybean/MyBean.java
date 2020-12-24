package com.ceking.factorybean;

import com.ceking.springdemo1.Course;
import org.springframework.beans.factory.FactoryBean;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 15:22
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course =new Course();
        course.setCname("my couse");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
