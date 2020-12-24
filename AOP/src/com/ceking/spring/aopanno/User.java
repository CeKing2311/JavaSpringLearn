package com.ceking.spring.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 19:46
 */
@Component
public class User {
    public void  add(){
        System.out.println("user add ...");
    }
}
