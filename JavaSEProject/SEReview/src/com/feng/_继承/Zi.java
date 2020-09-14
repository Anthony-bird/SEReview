package com.feng._继承;

public class Zi extends Fu {
    public int height =175;
    public int age =20;

    public Zi() {
//        super();
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age) {
       // super();
        System.out.println("Zi中带参构造方法被调用");
    }

    public void method(){
//        System.out.println("method方法被调用");
        int age =30;
        System.out.println(height);
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }

}
