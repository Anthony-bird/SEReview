package com.feng._匿名内部类;

public class Outer {
    public void method(){
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();
    }
}
