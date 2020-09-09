package com.feng._求偶数和;
/**
 * 求1-100 偶数和
 * */
public class ForTest03 {
    public static void main(String[] args) {
        int sum =0 ;
        for (int i =1;i<=100;i++){
            if (i % 2==0)
                sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
