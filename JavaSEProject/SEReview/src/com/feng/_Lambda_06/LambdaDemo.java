package com.feng._Lambda_06;
/**
 * Lambada表达式注意事项
 * */
public class LambdaDemo {
    public static void main(String[] args) {
//        useInter(()->{
//            System.out.println("好好学习，天天向上");
//        });

        useInter(()-> System.out.println("好好学习，天天向上"));

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();

//        Runnable r = new Thread(() -> System.out.println("匿名内部类"));
//        new Thread(r).start();

        new Thread(()-> System.out.println("Lambda表达式")).start();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
