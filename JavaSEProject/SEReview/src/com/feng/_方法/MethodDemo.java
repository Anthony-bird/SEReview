package com.feng._方法;


public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }

    private static void isEvenNumber() {
        int number = 10;
        number = 9;

        if (number%2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
