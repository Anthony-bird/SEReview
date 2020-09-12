package com.feng._用户登入;

import java.util.Scanner;

/**
 *需求：已知用户名和密码，请用程序实现模拟登录。总共给3次机会，登入之后，给出相应的提示
 * 思路：
 *     已知用户名和密码，定义两个字符串表示即可
 *     键盘录入要登入的用户名和密码，用Scanner实现
 *     键盘录入的与已知的进行比较，给出相应的提示
 *     用循环实现多次机会  在登入成功的时候，使用break结束循环
 *     */
public class StringTest01 {
    public static void main(String[] args) {
        //定义
        String username = "itheima";
        String password = "uzbk";
        //录入

        Scanner sc = new Scanner(System.in);
        for (int i =0;i<3; i++) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            //比较  2个else 登入成功 失败  账户锁定，与管理员
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登入成功");
                break;
            } else {
                if (2-i == 0){
                    System.out.println("账户被锁定，请与管理员联系");
                } else{
                    System.out.println("登入失败，您还有" +( 2 - i) + "次机会");
                }
            }

        }
    }
}
