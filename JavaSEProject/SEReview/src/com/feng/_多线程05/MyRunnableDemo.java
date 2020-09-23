package com.feng._多线程05;
/**
 * 接口实现多线程 第2中方式
 * */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);

        Thread t1 = new Thread(my,"高铁");
        Thread t2 = new Thread(my,"飞机");

        t1.start();
        t2.start();
    }
}
