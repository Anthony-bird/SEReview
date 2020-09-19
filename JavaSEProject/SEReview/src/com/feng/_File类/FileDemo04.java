package com.feng._File类;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("SEReview\\java.txt");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("-------");

        File f2 = new File("E:\\itcast");
        String[] strArray = f2.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("-----------");

        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
//            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
