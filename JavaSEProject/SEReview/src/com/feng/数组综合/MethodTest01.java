package com.feng.数组综合;

public class MethodTest01 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        //调用方法
        printArray(arr);
    }

    private static void printArray(int[] arr) {
            System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
