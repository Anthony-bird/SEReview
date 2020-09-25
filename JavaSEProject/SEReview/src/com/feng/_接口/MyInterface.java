package com.feng._接口;

public interface MyInterface {
    public void show1();
    public void show2();

    default void show3(){
        System.out.println("show3");
    };
}
