package com.feng._异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo05 {
    public static void main(String[] args) {

        method();
        method2();
    }

    private static void method2() {
        try {
            String ss = "2048-08-09 11:11:11";
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dd = sdf2.parse(ss);
            System.out.println(dd);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void method() {
        try {
            int [] arr={1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
             e.printStackTrace();
        }
    }
}
