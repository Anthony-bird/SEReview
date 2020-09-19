package com.feng._File类;

import java.io.File;
import java.io.IOException;
/**
 * 删除
 * */
public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("SEReview\\java.txt");
//        System.out.println(f1.createNewFile());

        System.out.println(f1.delete());
        System.out.println("---------");

        File f2 = new File("SEReview\\itcast");
//        System.out.println(f3.mkdir());

        System.out.println(f2.delete());
        System.out.println("---------");

        File f3 = new File("SEReview\\itcast");
//        System.out.println(f3.mkdir());
        File f4 = new File("SEReview\\itcast\\java.txt");
//        System.out.println(f4.createNewFile());
        System.out.println(f4.delete());
        System.out.println(f3.delete());
    }
}
