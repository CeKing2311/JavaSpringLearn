package com.ceking.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ceking
 * @desc
 * @date 2020/12/24 19:47
 */
@Component
@Aspect  //生成代理对象
@Order(value = 2)
public class UserProxy {
//    相同的切入点进行抽取
    @Pointcut(value = "execution(* com.ceking.spring.aopanno.User.add(..))")
    public void  pointDemo(){}
    //前置通知
    //@Before注解表示前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("userProxy before");
    }
    //后置通知 最后通知
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after ....");
    }
    //后置通知 返回通知，有异常时不执行
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning ....");
    }
    //异常通知，只有出现异常的时候才执行
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing ....");
    }
    //环绕通知
    @Around(value = "execution(* com.ceking.spring.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint ) throws Throwable {
        System.out.println("环绕之前 ....");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后 ....");
    }

}
