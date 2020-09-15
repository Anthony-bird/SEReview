package com.feng._Integer与string数据排序;

import java.util.Arrays;

/**
 * 定义一个字符串，得到字符串每一个数据，定义一个int数组，准换成int，排序，
 * 采用StringBuilder来实现
 * 输出结果
 * */
public class IntegerTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91 27 46 38 50";

        String[] strArray = s.split(" ");
       /* for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }*/

        int[] arr = new int[strArray.length];
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<arr.length;i++){
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
