package com.feng._接口2;

public interface Inner {
    void show();

    default void method(){
        System.out.println("默认方法执行了");
    };

    public static void test(){
        System.out.println("静态方法执行了");
    }
}
