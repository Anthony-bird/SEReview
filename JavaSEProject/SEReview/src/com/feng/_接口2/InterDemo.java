package com.feng._接口2;
/**
 * 接口中静态方法
 * */
public class InterDemo {
    public static void main(String[] args) {
        Inner i = new InterImpl();

        i.show();
        i.method();

//        i.test();
        Inner.test();
//        InterImpl.test();
        Flyable.test();
    }
}
