package com.feng._不死神兔;
/**
 * 需求：
 *     有一对兔子从出生第三个月，每个月都生出一对小兔子，小兔子长到第三个月又生一对小兔子，
 *     假如兔子都不死，问第20个月兔子对数是多少
 *  思路：
 *      1。初始化
 *      2.定义第一，二个月数组对数
 *      3.用循环实现每个月兔子对数
 *      4输出第20个月
 *      */

public class Test04 {
    public static void main(String[] args) {
       //为了储存兔子对数，定义一个数组,用动态初始化完成数组元素的初始化，长度为20
        int[] arr= new int[20];
        //第一,二个月数组元素是已知的
         arr[0] = 1;
         arr[1] = 1;
        // arr[2]=arr[0]+arr[1]
        // arr[3]=arr[1]+arr[2]

        //用循环实现计算每个月兔子对数
        for (int i=2;i < arr.length;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }
        //输出数组最后元素的值，第20个月
        System.out.println("第20个月兔子有："+arr[19]);
    }
}
