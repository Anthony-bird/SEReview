package com.feng._字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 字节流读数据
 * */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("SEReview\\fos.txt");

        /*byte[] bys = new byte[5];

        //第一次读数据
        int len = fis.read(bys);
        System.out.println(len);
//        System.out.println(new String(bys));
        System.out.println(new String(bys, 0, len));

        //第二次读数据
        len = fis.read(bys);
        System.out.println(len);
//        System.out.println(new String(bys));
        System.out.println(new String(bys, 0, len));

        //第三次读数据
        len = fis.read(bys);
        System.out.println(len);
//        System.out.println(new String(bys));
        System.out.println(new String(bys, 0, len));

        //再多读几次
        len = fis.read(bys);
        System.out.println(len);
        len = fis.read(bys);
        System.out.println(len);*/

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys)) !=-1){
            System.out.println(new String(bys, 0, len));
        }
        fis.close();
    }
}
