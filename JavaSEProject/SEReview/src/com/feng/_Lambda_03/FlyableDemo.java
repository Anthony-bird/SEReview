package com.feng._Lambda_03;
/**
 * 抽象方法带参无返回值
 * */
public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("---------------");

        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }
}
