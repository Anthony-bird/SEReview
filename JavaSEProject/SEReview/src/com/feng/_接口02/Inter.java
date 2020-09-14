package com.feng._接口02;
/**
 * 接口里面没有构造器 和非抽象方法
 * */
public interface Inter {
    public int num = 10;
    public final int num1 = 20;

//    public static final  int num3 =30;
    int num3 =30;

    public abstract void method();
    void show();
}
