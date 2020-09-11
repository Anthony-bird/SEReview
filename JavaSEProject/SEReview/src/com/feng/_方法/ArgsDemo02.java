package com.feng._方法;
/**
 * 对于引用参数类型，形参的改变影响实参的值
 * */
public class ArgsDemo02 {
    public static void main(String[] args) {
        int [] arr={10,20,30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    private static void change(int[] arr) {
        arr[1] = 200;
    }
}
