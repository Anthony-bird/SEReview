package com.feng._异常;
/**
 * JVM的默认处理  把异常信息输出在控制台，程序终止运行
 * */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    private static void method() {
        int [] arr={1,2,3};
        System.out.println(arr[3]);
    }
}
