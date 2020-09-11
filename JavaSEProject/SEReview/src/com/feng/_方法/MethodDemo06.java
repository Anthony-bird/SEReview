package com.feng._方法;


/**
 * 方法的重载:
 *         多个方法在同一个类中
 *         多个方法具有相同的方法名
 *         多个方法的参数不同，类型不同或数量不同
 *
 * */
public class MethodDemo06 {
    public static void main(String[] args) {
        int i = sum(10, 20);
        double d = sum(10.0, 20.0);
        int i1 = sum(10, 20, 30);
        System.out.println(i);
        System.out.println(d);
        System.out.println(i1);

    }

    //需求1:两个int类型参数和的方法
    public static int sum(int a,int b){
        return a + b;
    }
    //需求2:两个double类型参数和的方法
    public static double sum(double a,double b){
        return a + b;
    }
    //需求3:三个int类型参数和的方法
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
