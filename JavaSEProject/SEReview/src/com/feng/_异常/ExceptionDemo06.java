package com.feng._异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        System.out.println("开始");
       // method();
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    private static void method2() throws ParseException {

            String ss = "2048-08-09 11:11:11";
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dd = sdf2.parse(ss);

    }

    private static void method() throws ArrayIndexOutOfBoundsException{

            int [] arr={1,2,3};
            System.out.println(arr[3]);
    }
}
