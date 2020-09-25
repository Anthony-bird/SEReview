package com.feng._myMethodReference_03;
/**
 * 引用类方法
 * */
public class ConverterDemo {
    public static void main(String[] args) {
        useConverter((String s)->{
            return Integer.parseInt(s);
        });

        useConverter(s -> Integer.parseInt(s));

        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}
