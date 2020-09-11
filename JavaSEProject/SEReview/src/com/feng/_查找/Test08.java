package com.feng._查找;

import java.util.Scanner;

/**
 *  需求：
 *      已知一个数组 arr ={19,28，37，46，50} 查找数组
 *   思路：
 *       1.定义一个数组
 *       2.录入
 *       3.索引初始值
 *       4.遍历数组
 *       5.比较
 *       6.输出
 *       */
public class Test08 {
    public static void main(String[] args) {
       int[] arr ={19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入录入的数字");
        int number = sc.nextInt();

        System.out.println(getIndex(arr, number));
       /* int index = -1;

        for (int i=0;i<arr.length;i++){
            if (arr[i] == number)
                index = i;
        }
        System.out.println("index:"+index);*/


    }
    public static int getIndex(int[] arr, int number){
        int index = -1;

        for (int i=0;i<arr.length;i++){
            if (arr[i] == number)
                index = i;
                break;
        }
        return index;
    }

}
