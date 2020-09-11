package com.feng._减肥计划;

import java.util.Scanner;

/**
 * 减肥计划if版
 *
 * 需求：周一 ：跑步
 *       周二：游泳
 *       周三：慢走
 *       周四：动感单车
 *       周五：拳击
 *       周六：爬山
 *       周日：好好吃一顿
 * */
public class Test01 {
    public static void main(String[] args) {
        //键盘录入一个星期数，用变量接收
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        //对星期判断 用if语句实现

        if (week <1 || week>7){
            System.out.println("你输入的星期有误");
        } else if (week == 1){
            System.out.println("跑步");
        } else if (week == 2){
            System.out.println("游泳");
        } else if (week == 3){
            System.out.println("慢走");
        } else if (week == 4){
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else {
            System.out.println("好好吃一顿");
        }


    }
}
