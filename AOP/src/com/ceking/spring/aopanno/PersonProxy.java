package com.ceking.spring.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 20:11
 */
@Component
@Aspect
@Order(value = 1) //值越小，优先级越高
public class PersonProxy {

    //@Before注解表示前置通知
    @Before(value = "execution(* com.ceking.spring.aopanno.User.add(..))")
    public void before(){
        System.out.println("PersonProxy before");
    }

}
