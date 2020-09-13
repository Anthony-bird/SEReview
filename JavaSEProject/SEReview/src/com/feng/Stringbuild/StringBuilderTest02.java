package com.feng.Stringbuild;

import java.util.Scanner;

/**
 * 字符串反转升级版
 * */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        //录入
        Scanner sc = new Scanner(System.in);
        System.out.println("前输入一个字符串");

        String line = sc.nextLine();
        //调用方法（先定义）
        String s = myReverse(line);
        //输出
        System.out.println(s);

    }
    //定义一个方法，实现字符串反转，返回值类型是string，参数string s

    public static String myReverse(String s){
      /*  StringBuilder sb = new StringBuilder(s);
        StringBuilder r = sb.reverse();
        String s1 = r.toString();
        return s1;*/

      return new StringBuilder(s).reverse().toString();
    }
}
