package com.feng._反射05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.feng._反射02.Student");

//        Method[] methods = c.getMethods();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------");

        Method m = c.getMethod("method1");


        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        m.invoke(obj);
    }
}
