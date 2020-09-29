package com.feng._反射03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.feng._反射02.Student");

        Constructor<?> con = c.getDeclaredConstructor(String.class);
        //暴力反射
        con.setAccessible(true);

        Object obj = con.newInstance("露娜");
        System.out.println(obj);
    }
}
