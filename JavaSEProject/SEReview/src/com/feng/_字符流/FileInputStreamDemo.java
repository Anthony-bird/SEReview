package com.feng._字符流;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 字节流读取文本数据
 * 汉字储存  ：GBK 占用2个字节
 *            UTF  占用3个字节
 *     */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("SEReview\\a.txt");
//
//        int by;
//        while ((by = fis.read())!=-1){
//            System.out.print((char) by);
//        }
//        fis.close();

        String s = "中国";
//        byte[] bys = s.getBytes();
//        byte[] bys = s.getBytes("UTF-8");
        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));
    }
}
