package com.feng._形参接口类;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
