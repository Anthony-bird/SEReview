package com.feng._反射03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<?> c = Class.forName("com.feng._反射02.Student");

        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object obj = con.newInstance("林青霞", 30, "北京");
        System.out.println(obj);
    }
}
