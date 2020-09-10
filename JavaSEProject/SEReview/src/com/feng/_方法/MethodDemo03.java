package com.feng._方法;

public class MethodDemo03 {
    public static void main(String[] args) {
        getMax(10,20);
    }


    public static void getMax(int a,int b) {
        if (a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
