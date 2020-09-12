package com.feng._String构造方法;


/**
 * string 构造方法：
 *         public String():创建一个空白字符串对象，不含任何内容
 *         public String(char[] chs):     字符数组
 *         public string(byte[] bys):    字节数组
 *         String s="abc"  直接赋值
 *
 *         推荐使用直接赋值的方式得到对象*/
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        //public String(char[] chs):     字符数组
        char[] chs ={'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys={97,98,99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        String s4 = "abc";
        System.out.println("s4:" +s4);
    }
}
