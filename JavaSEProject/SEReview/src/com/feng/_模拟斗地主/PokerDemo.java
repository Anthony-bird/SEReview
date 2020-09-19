package com.feng._模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 需求：
 *      实现斗地主中的洗牌，发牌，看牌
 *  思路：
 *      创建一个牌盒
 *      装牌
 *      洗牌
 *      发牌
 *      看牌
 *      */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        String[] colors ={"♦","♣","♥","♠"};
        String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String color : colors) {
            for (String number : numbers) {
               array.add (color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        Collections.shuffle(array); //洗牌

        //发牌
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> lyArray = new ArrayList<>();
        ArrayList<String> fqyArray = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();

        for (int i=0;i<array.size();i++){
            String poker = array.get(i);

            if (i>= array.size()-3){
                dpArray.add(poker);
            } else if (i % 3 == 0){
                lqxArray.add(poker);
            } else if (i % 3 == 1){
                lyArray.add(poker);
            } else if (i % 3 == 2){
                fqyArray.add(poker);
            }
        }
        //看牌
        lookPoker("林青霞",lqxArray);
        lookPoker("柳岩",lyArray);
        lookPoker("风清扬",fqyArray);
        lookPoker("底牌",dpArray);
    }
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name + "的牌是:");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
