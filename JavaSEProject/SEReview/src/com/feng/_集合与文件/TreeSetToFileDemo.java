package com.feng._集合与文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student01> ts = new TreeSet<>(new Comparator<Student01>() {
            @Override
            public int compare(Student01 o1, Student01 o2) {
                int number = o2.getSum()-o1.getSum();
                int number2 = number==0 ?o1.getChinese()-o2.getChinese():number;
                int number3 = number2==0 ?o1.getMath()-o2.getMath():number2;
                int number4 = number3==0 ?o1.getName().compareTo(o2.getName()):number3;
                return number4;
            }
        });

        for (int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入" + (i + 1) + "个学生:");
            System.out.println("姓名:");
            String name = sc.nextLine();
            System.out.println("语文成绩");
            int Chinese = sc.nextInt();
            System.out.println("数学成绩");
            int math = sc.nextInt();
            System.out.println("英语成绩");
            int english = sc.nextInt();

            Student01 s = new Student01();
            s.setName(name);
            s.setChinese(Chinese);
            s.setMath(math);
            s.setEnglish(english);

            ts.add(s);

        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\ts.txt"));

        for (Student01 s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
