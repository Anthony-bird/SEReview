package com.feng._数据输入;

import java.util.Scanner;

/**
 * 数据输入：
 *     导包
 *     创建对象
 *     接收数据
 *     */
public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        int i = sc.nextInt();
        //输出数据
        System.out.println("i="+i);
    }
}
