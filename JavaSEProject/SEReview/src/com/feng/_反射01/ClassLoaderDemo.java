package com.feng._反射01;


public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);//AppletClassLoader应用程序加载器

        ClassLoader c2 = c.getParent();
        System.out.println(c2); //PlatformClassLoader平台类加载器

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);  // null 虚拟机内置加载器
    }
}
