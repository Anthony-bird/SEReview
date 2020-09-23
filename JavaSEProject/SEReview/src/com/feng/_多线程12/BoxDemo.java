package com.feng._多线程12;
/**
 * 生产者和消费者模式
 * */
public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer p = new Producer(b);
        Customer c = new Customer(b);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
