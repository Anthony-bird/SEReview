package com.feng._字节流;

import java.io.*;

/**
 * 复制视频
 * 1.基本字节流 一次读取一个   700456毫秒
 * 2.基本字节流 一次读取一个字节数组  1089毫秒
 * 3.字节缓冲流  一次读取一个    3255毫秒
 * 4.字节缓冲流  一次读取一个字节数组   263毫秒
 * */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

//        method01();
//        method02();
//        method03();
        method04();

        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }

    public static void method04() throws IOException {
        BufferedInputStream bis =new BufferedInputStream (new FileInputStream("E:\\itcast\\qq1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("SEReview\\qq1.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
    public static void method03() throws IOException {
        BufferedInputStream bis =new BufferedInputStream (new FileInputStream("E:\\itcast\\qq1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("SEReview\\qq1.mp4"));

        int by;
        while ((by = bis.read())!=-1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }
    public static void method02() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\itcast\\qq1.mp4");
        FileOutputStream fos = new FileOutputStream("SEReview\\qq1.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }

    public static void method01() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\itcast\\qq1.mp4");
        FileOutputStream fos = new FileOutputStream("SEReview\\qq1.mp4");

        int by;
        while ((by = fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
