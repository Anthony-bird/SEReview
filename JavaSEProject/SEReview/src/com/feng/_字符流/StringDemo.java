package com.feng._字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/**
 * 编码与解码
 * */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
//        byte[] bys = s.getBytes();
        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));

//        String ss = new String(bys);
        String ss = new String(bys, "GBK");
        System.out.println(ss);
    }
}
