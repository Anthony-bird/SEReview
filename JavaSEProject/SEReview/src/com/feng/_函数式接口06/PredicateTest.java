package com.feng._函数式接口06;

import java.util.ArrayList;
import java.util.function.Predicate;
/**
 * 接口筛选满足条件顺序
 * */
public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30","柳岩,34","张曼玉,35","王祖贤,33"};

        ArrayList<String> array=myFilter(strArray,s->s.split(",")[0].length()>2,
                s -> Integer.parseInt(s.split(",")[1])>33);
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1,Predicate<String> pre2) {
        ArrayList<String> array = new ArrayList<>();

        for (String str : strArray) {
            if (pre1.and(pre2).test(str)){
                array.add(str);
            }
        }
        return array;
    }
}
