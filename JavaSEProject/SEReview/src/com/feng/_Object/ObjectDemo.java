package com.feng._Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("露娜");
        s1.setAge(18);

        System.out.println(s1);//com.feng._Object.Student@1540e19d
        System.out.println(s1.toString());

        Student s2 = new Student();
        s2.setName("露娜");
        s2.setAge(18);

        System.out.println(s2);//com.feng._Object.Student@1540e19d
        System.out.println(s2.toString());

       /* public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/
        System.out.println(s1.equals(s2));
    }
}
