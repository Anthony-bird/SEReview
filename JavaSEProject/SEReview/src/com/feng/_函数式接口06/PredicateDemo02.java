package com.feng._函数式接口06;

import java.util.function.Predicate;

/**
 * Predicate常用方法  and or 方法
 * */
public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString("helloWorld",s -> s.length() > 8 );
        System.out.println(b2);

        boolean b3 = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b3);

        boolean b4 = checkString("helloWorld", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);
    }

    private static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2) {
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre1.test(s);
//        boolean b = b1 && b2;
//        return b;

//        return pre1.and(pre2).test(s);
        return pre1.or(pre2).test(s);

    }
    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
