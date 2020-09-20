package com.feng._字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 字节流读数据
 * */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("SEReview\\fos.txt");

//        int by = fis.read();
//        while (by!=-1){
//            System.out.print((char) by);
//             by = fis.read();
//        }

        int by;
        while ((by = fis.read()) !=-1){
            System.out.print((char) by);
        }
        fis.close();
    }
}
