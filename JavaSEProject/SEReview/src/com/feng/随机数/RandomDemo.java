package com.feng.随机数;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i=0;i<10;i++){
            //获取随机数
            int number = r.nextInt(10);
            System.out.println(number);
        }
        int x = r.nextInt(100) + 1;
        System.out.println(x);
    }
}
