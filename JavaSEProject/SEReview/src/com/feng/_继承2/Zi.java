package com.feng._继承2;

public class Zi extends Fu {
    public void method(){
        System.out.println("Zi的method方法被调用");
    }

    public void show(){
        super.show();
        System.out.println("Zi中的show方法被调用");
    }
}
