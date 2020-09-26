package com.feng._函数式接口06;

import java.util.function.Predicate;

/**
 * Predicate常用方法  判断参数是否满足指定的条件
 * */
public class PredicateDemo01 {
    public static void main(String[] args) {
//        boolean b1 = checkString("hello", (String s) -> {
//            return s.length() > 8;
//        });

        boolean b1 = checkString("hello",s -> s.length() > 8 );
        System.out.println(b1);
        boolean b2 = checkString("helloWorld",s -> s.length() > 8 );
        System.out.println(b2);
    }

    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
//        return !pre.test(s);
        return pre.negate().test(s);
    }
}
