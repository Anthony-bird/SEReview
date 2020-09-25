package com.feng._函数式接口02;
/**
 * 函数式接口作为方法的参数
 * */
public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程开始运行");
            }
        });

        startThread(()->System.out.println(Thread.currentThread().getName() + "线程开始运行"));
    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }
}
