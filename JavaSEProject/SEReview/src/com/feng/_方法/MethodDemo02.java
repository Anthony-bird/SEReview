package com.feng._方法;

public class MethodDemo02 {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);

        //变量值的调用
        int number = 11;
        isEvenNumber(number);
    }

    private static void isEvenNumber(int number) {
        if (number%2 == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
