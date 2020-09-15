package com.feng._Integer与string相互转换;

public class IntegerDemo {
    public static void main(String[] args) {
        //int-->string
        int number=100;
        //method 1
        String s1 = "" + number;
        System.out.println(s1);
        //method 2
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("------------");

        //string->int
        String s = "100";
        //method 1

        //string->Integer->int
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);
        //method 2
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
