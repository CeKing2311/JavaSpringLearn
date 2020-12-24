package com.ceking.springdemo1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 14:10
 */
public class Student {

    private String[] courses;
    private List<String> list;
    private Map<String,Object> maps;
    private Set<String> sets;
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
    public  void  showCourses(){
        System.out.println(Arrays.toString(courses) );
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
