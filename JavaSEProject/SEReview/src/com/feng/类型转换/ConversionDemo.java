package com.feng.类型转换;

public class ConversionDemo {
    public static void main(String[] args) {
        //自动转换类型
        double d = 10;
        //定义一个byte类型的变量
        byte b = 10;
        short s = b;
        int i = s;
        //这是不可以的，类型不兼用
//        char c = i;
        //强制类型转换
        int a =(int)88.88;
        System.out.println(a);
    }
}
