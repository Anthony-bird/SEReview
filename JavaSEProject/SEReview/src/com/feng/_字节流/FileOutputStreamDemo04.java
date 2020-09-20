package com.feng._字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流写数据加异常处理
 * */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("Z:\\SEReview\\fos.txt");
            fos = new FileOutputStream("SEReview\\fos.txt");
            fos.write("hello".getBytes());
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
