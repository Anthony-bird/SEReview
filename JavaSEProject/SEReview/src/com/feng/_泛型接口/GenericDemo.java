package com.feng._泛型接口;

public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> g1 = new GenericImpl<>();
        g1.show("林青霞");

        GenericImpl<Integer> g2 = new GenericImpl<>();
        g2.show(18);
    }
}
