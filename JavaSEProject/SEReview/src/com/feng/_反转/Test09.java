package com.feng._反转;
/**
 * 反转
 * 1.定义
 * 2.遍历
 * 3.交换
 * 4.打印
 * */
public class Test09 {
    public static void main(String[] args) {
        int[] arr = {19, 48, 37, 46, 50};

       /* for (int start=0, end =arr.length-1; start <=end;start ++,end-- ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }*/
        reverse(arr);
        printArray(arr);
    }


    public static void reverse(int []arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0;i< arr.length;i++){
            if (i == arr.length-1){
                System.out.print(arr[i]);
            } else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

}