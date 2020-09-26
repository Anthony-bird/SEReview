package com.feng._函数式接口07;

import java.util.function.Function;

/**
 * 1.将字符串截取到数字年龄部分
 * 2.将上一步的年龄转换成int类型
 * 3.将上一步int加70，得到并输出
 * */
public class FunctionTest {
    public static void main(String[] args) {
        String s = "林青霞,30";

//        convert(s,(String ss)->{
//            return s.split(",")[1];
//        },(String ss)->{
//            return Integer.parseInt(ss);
//        },(Integer i) ->{
//            return i + 70;
//        } );

//        convert(s, ss-> s.split(",")[1] ,ss->  Integer.parseInt(ss),i -> i + 70);
        convert(s,ss-> s.split(",")[1],Integer::parseInt,i->i + 70);
    }

    private static void convert(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3) {
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
