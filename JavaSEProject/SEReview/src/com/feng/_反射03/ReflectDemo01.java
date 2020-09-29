package com.feng._反射03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.feng._反射02.Student");
//        Constructor<?>[] cons = c.getConstructors();  //返回公共构造函数
        Constructor<?>[] cons = c.getDeclaredConstructors();  //返回所有
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }
        System.out.println("------------");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
