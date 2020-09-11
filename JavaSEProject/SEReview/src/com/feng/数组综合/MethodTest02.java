package com.feng.数组综合;

/**
 * 用数组求最大值
 * 思路：
 *     1.定义一个数组，用静态初始化完成数组元素的初始化
 *     2.定义一个方法，用来获取数组元素的最大值
 *     3.调用获取元素值最大的方法，用变量接收返回结果
 *     4.输出
 *     */
public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr={11,65,45,25,46,99};
        int max = getMax(arr);
        System.out.println("getMax=" + max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        return max;

    }
}
