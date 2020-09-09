package com.feng.三个和尚升级版;

import static java.lang.System.in;

import java.util.Scanner;

/**
 * 三个和尚
 *
 * 需求：
 *     一座寺庙里住着三个和尚，他们的身高必须经过测量得出，
 *     请用程序实现获取这三个和尚的最高身高*/
public class ScannerTest {
    public static void main(String[] args) {
        //采用键盘录入
        Scanner sc = new Scanner(in);
        //键盘分别录入3个身高赋值给三个变量
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();
        //用三元运算符获取前两个和尚的较高身高值，并用临时变量保存
        int temp = (height1 > height2)? height1:height2;
        //用三元运算符获取临时身高值与第三个身高进行比较，并用最大身高变量保存
        int max = (temp > height3)? temp:height3;

        System.out.println("max:=" +max);
    }
}
