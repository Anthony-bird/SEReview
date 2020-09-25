package com.feng._接口3;
/**
 * 接口中私有方法
 *     默认方法可以调用静态方法和非静态方法
 *     静态方法只能调用静态方法
 *     */
public interface Inter {
    default void show1(){
        System.out.println("show1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
//        method();
        System.out.println("show1执行结束");
    }

//    private  void show(){             //jdk1.9新功能
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//    }

    default void show2(){
        System.out.println("show2开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        System.out.println("show2执行结束");
    }

    static void method1(){
        System.out.println("method1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();

//        method();
        System.out.println("method1执行结束");
    }

//    private static void method() {     //jdk1.9新功能
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//    }

    static void method2(){
        System.out.println("method2开始执行");
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
        System.out.println("method2执行结束");
    }
}
