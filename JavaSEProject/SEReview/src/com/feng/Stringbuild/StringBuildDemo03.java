package com.feng.Stringbuild;
/**
 * stringbuilder和string相互转换
 * */
public class StringBuildDemo03 {
    public static void main(String[] args) {
        //stringBuilder 装换成String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        //String s= sb;  //这是个错误的方法

        String s = sb.toString();
        System.out.println(s);

        //string转换成stringBuilder

        String s1 = "java";
        //StringBuilder sb1 =s1; //错误的方法

        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
