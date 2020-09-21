package com.feng._集合与文件;

import java.io.*;
import java.util.ArrayList;
/**
 * 文件到集合
 * */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("SEReview\\students.txt"));

        ArrayList<Student> array = new ArrayList<>();

        String line;
        while ((line=br.readLine())!=null){
            String[] strArray = line.split(",");
            Student s = new Student();

            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setAddress(strArray[3]);

            array.add(s);
        }
        br.close();

        for (Student s : array) {
            System.out.println(s.getSid() + (",") + s.getName() + (",") + s.getAge() + (",") + s.getAddress());
        }
    }
}
