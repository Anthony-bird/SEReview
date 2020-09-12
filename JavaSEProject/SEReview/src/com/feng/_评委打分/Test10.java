package com.feng._评委打分;

import java.util.Scanner;

/**
 * 评委打分
 *        需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分
 *             选手的最后得分为，去掉一个最高和最低分 的4个评委平均值
 *         思路：定义一个数组长度为6
 *               录入分数
 *               评委打分 循环遍历
 *               定义方法最高分，调用
 *               定义方法最低分
 *               获取数组元素中所有和
 *               计算平均分
 *               输出平均分
 *               */
public class Test10 {
    public static void main(String[] args) {
        int []arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i=0;i< arr.length;i++){
            System.out.println("请第"+(i+1)+"个评委打分");
            arr[i] = sc.nextInt();
        }

        //printArray(arr);
        int max = getMax(arr);

        int min = getMin(arr);

        int sum= getSum(arr);

        int avg= (sum - max - min) /(arr.length-2);
        System.out.println("选手的最终得分是" + avg);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i] < min){
                min =arr[i];
            }
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;

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
