package com.feng._多线程04;
/**
 * 守护线程，当运行的线程是守护线程时，java虚拟机将退出
 * */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");

        Thread.currentThread().setName("刘备");

        td1.setDaemon(true);
        td2.setDaemon(true);   //低配CPU跑不动

        td1.start();
        td2.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
