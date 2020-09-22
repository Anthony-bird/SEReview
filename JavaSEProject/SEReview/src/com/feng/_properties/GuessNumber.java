package com.feng._properties;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start(){
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数字:");
            int guessNumber = sc.nextInt();

            if (guessNumber > number){
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number){
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
