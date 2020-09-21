package com.feng._集合与文件;

import java.io.*;
import java.util.ArrayList;
/**
 * 集合到文件
 * */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("aa001", "林青霞", 30, "西安");
        Student s2 = new Student("aa002", "张曼玉", 35, "武汉");
        Student s3 = new Student("aa003", "王祖贤", 33, "郑州");

        array.add(s1);
        array.add(s2);
        array.add(s3);
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\students.txt"));

        for (Student s : array) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
