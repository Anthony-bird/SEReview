package com.feng._集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

//        Collections.sort(list);//按照升序排列

//        Collections.reverse(list);//反转

        Collections.shuffle(list);//随机
        System.out.println(list);
    }
}
