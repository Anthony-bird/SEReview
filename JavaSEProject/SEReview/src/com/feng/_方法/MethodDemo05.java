package com.feng._方法;

public class MethodDemo05 {
    public static void main(String[] args) {
        //调用定义好的方法并使用变量保存

        int result = getMax(10,20);
        System.out.println(result);
        //调用定义好的方法并直接打印结果

        System.out.println(getMax(10, 20));
    }

    private static int getMax(int a, int b) {
        if (a>b){
            return a;
        } else{
            return b;
        }
    }

    public static void method() {
//        return 100;
        return;

//        System.out.println(100);
    }
}
