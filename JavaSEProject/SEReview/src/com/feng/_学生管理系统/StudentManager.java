package com.feng._学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

/**
* 学生管理系统
 * */
public class StudentManager {
    /*
    * 1.用输出语句完成主界面的编写
    * 2.录入数据
    * 3.用switch完成选择操作
    * 4.用循环再次回到主界面
    * */
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);//JVM退出

            }
        }
    }

    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag = false;

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }
    //用于添加学生信息
   /* public static void addStudent(ArrayList<Student> array){
        //录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //添加
        array.add(s);
        //提示
        System.out.println("添加学生成功");
    }*/
    public static void addStudent(ArrayList<Student> array){
        //录入
        Scanner sc = new Scanner(System.in);
        String sid;
        //重复学号验证
        while (true){
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag){
                System.out.println("你输入的学号已被使用,请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //添加
        array.add(s);
        //提示
        System.out.println("添加学生成功");
    }


    //查看
    /*public static void findAllStudent(ArrayList<Student> array){
        //显示表头信息
        System.out.println("学号\t姓名\t年龄\t\t居住地");

        for (int i=0; i<array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }*/
    //升级版
    public static void findAllStudent(ArrayList<Student> array){
        //判断集合中是否有数据信息，如果没有则提示
        if (array.size()==0){
            System.out.println("无信息，请添加信息在查询");
            return;
        }

        //显示表头信息
        System.out.println("学号\t姓名\t年龄\t\t居住地");

        for (int i=0; i<array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }
    //删除
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号:");
        String sid = sc.nextLine();

        //在删除操作之前，对学号是否存在进行判断
        int index =-1;

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生信息成功");
        }
    }
    //修改
    public static void updateStudent(ArrayList<Student> array){
        System.out.println("请输入要修改的学生的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        //修改学生的信息
        System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改成功");
    }
}
