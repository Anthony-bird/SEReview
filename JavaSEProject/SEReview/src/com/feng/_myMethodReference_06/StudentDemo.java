package com.feng._myMethodReference_06;
/**
 * 引用构造器
 * */
public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder( (String name,int age)->{
            return new  Student(name,age);
        });

        useStudentBuilder( (name,age)->  new Student(name,age));

        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build ("林青霞",37);
        System.out.println(s.getName()+","+s.getAge());
    }
}
