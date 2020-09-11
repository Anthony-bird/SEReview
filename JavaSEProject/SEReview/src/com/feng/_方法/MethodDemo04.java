package com.feng._方法;

public class MethodDemo04 {
    public static void main(String[] args) {
        boolean flag= isEvenNumber(10);
        System.out.println(flag);
    }

    private static boolean isEvenNumber(int number) {
        if (number%2 == 0){
            return true;
        } else {
            return false;
        }

    }
}
