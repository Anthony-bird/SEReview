package com.feng._函数式接口01;
/**
 * 函数式接口
 * */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my= () -> System.out.println( "函数式接口");
        my.show();
    }
}
