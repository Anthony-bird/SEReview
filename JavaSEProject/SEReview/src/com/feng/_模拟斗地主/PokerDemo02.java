package com.feng._模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo02 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        ArrayList<Integer> array = new ArrayList<>();

        String[] colors ={"♦","♣","♥","♠"};
        String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int index =0;

        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        hm.put(index,"大王");
        array.add(index);

        Collections.shuffle(array); //洗牌

        //发牌
        TreeSet<Integer> lqxSet = new TreeSet<>();
        TreeSet<Integer> lySet = new TreeSet<>();
        TreeSet<Integer> fqySet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i=0;i<array.size();i++){
            int x = array.get(i);

            if (i>= array.size()-3){
                dpSet.add(x);
            } else if (i % 3 == 0){
                lqxSet.add(x);
            } else if (i % 3 == 1){
                lySet.add(x);
            } else if (i % 3 == 2){
                fqySet.add(x);
            }
        }
        //看牌
        lookPoker("林青霞",lqxSet,hm);
        lookPoker("柳岩",lySet,hm);
        lookPoker("风清扬",fqySet,hm);
        lookPoker("底牌",dpSet,hm);
    }
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name + "的牌是:");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();

    }
}
