package com.feng._集合Set成绩排序;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();
                int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
                int num3 = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;
                return num3;
            }
        });

        Student s1 = new Student("林青霞", 98,100);
        Student s2 = new Student("张曼玉", 95,95);
        Student s3 = new Student("王祖贤", 100,93);
        Student s4 = new Student("刘岩", 100,97);
        Student s5 = new Student("风清扬", 98,98);

        Student s6 = new Student("左冷禅", 97,99);
        Student s7 = new Student("赵云", 97,99);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath()+ ","+s.getSum());
        }


    }
}
