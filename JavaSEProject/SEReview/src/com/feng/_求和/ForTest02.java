package com.feng._求和;
/**
 * 求1-5数据和 并输出
 * */
public class ForTest02 {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 1;i<= 5;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
