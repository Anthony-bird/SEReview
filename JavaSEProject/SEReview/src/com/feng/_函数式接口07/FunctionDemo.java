package com.feng._函数式接口07;

import java.util.function.Function;
/**
 * andThen返回组合函数
 * */
public class FunctionDemo {
    public static void main(String[] args) {
//        convert("100",(String s)->{
//            return Integer.parseInt(s);
//        });

        convert("100",s -> Integer.parseInt(s));

//        convert("100",Integer::parseInt);

        convert(100,i->String.valueOf(i+566));

        convert("100",s -> Integer.parseInt(s),i->String.valueOf(i+566));
    }

    //字符串转int类型
    private static void convert(String s, Function<String,Integer> fun) {
        int i = fun.apply(s);
        System.out.println(i);
    }

    //int类型转字符串类型
    private static void convert(int i, Function<Integer,String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    //组合函数
    private static void convert(String s, Function<String,Integer> fun1,Function<Integer,String> fun2) {
//        Integer i = fun1.apply(s);
//        String ss= fun2.apply(i);

        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
