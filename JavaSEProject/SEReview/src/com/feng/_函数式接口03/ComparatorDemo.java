package com.feng._函数式接口03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * 函数式接口作为方法的返回值
 * */
public class ComparatorDemo {
    public static void main(String[] args) {
        //构造使用场景
        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");
        System.out.println("排序前：" + array);

//        Collections.sort(array);
        Collections.sort(array,getComparator());
        System.out.println("排序后：" + array);
    }

    private static Comparator<String> getComparator(){
//        Comparator<String> comp =new Comparator<String>(){
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };
//        return comp;

//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };

//        return (String s1,String s2)->{
//            return s1.length()-s2.length();
//        };

        return (s1,s2)->s1.length()-s2.length();
    }
}
