package com.feng._Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
//        MyRunnable my = new MyRunnable();
//        Thread t = new Thread(my);
//        t.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程启动了");
//            }
//        }).start();

        new Thread( ()->{
            System.out.println("多线程启动了");
        }).start();
    }
}
