package com.feng.Stringbuild;
/**
 * 字符串拼接升级版
 * */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //定义一个数组初始化
        int[] arr={1,2,3};
        String s = ArrayToString(arr);
        System.out.println("s"+s);
    }
    //定义一个方法，用于int数组中的数据按指定格式拼接成一个字符串返回
    /*
    * 两个明确：返回值类型string
    *          参数：int[] arr
    */
    public static String ArrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
