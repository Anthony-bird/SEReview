package com.feng._异常;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
        
    }

    private static void method() {

        int[] arr={1,2,3};

        System.out.println(arr[3]);//.ArrayIndexOutOfBoundsException
    }
}
