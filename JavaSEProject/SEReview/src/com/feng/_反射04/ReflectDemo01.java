package com.feng._反射04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.feng._反射02.Student");

//        Field[] fields = c.getFields();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------");

        Field addressField = c.getField("address");

        //获取无参构造方法
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        addressField.set(obj,"西安");

        System.out.println(obj);
    }
}
