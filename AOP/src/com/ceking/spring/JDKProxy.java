package com.ceking.spring;

import com.sun.corba.se.spi.ior.IORFactories;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*
 *@author ceking
 *@description
 *@date 2020-12-24 17:12
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] classes = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), classes, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao =new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), classes, new UserDaoProxy(userDao));
        int num = dao.add(1, 2);
        String name = dao.update("zhangsanfneg");
        System.out.println(num);
        System.out.println(name);
    }
}

//创建代理对象
class UserDaoProxy implements InvocationHandler {
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行：" + method.getName() + ";传递的参数：" + Arrays.toString(args));
        String methodName = method.getName();
        Object res=null;
        if ("add".equals(methodName)){
            //被增强执行的方法
            res = method.invoke(obj, args);
        }
        //方法之后
        System.out.println("方法之后执行："+obj);
        return res;
    }
}
