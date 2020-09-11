package com.feng._数组内容相同;

public class Test07 {
    public static void main(String[] args) {
        //定义两个数组，使用静态化完成数组元素初始化
        int []arr ={11,22,33,44,55};
        //int []arr2 ={11,22,33,44,55};
        int []arr2 ={11,22,33,44,5};
        boolean flag = compare(arr,arr2);
        System.out.println(flag);

    }
    public static boolean compare(int[] arr,int [] arr2){
        //首先比较长度
        if (arr.length !=arr2.length){
            return false;
        }
        //比较数组每一个元素，只要有元素不相同返回false
        for (int x=0;x<arr.length;x++){
            if (arr[x] !=arr2[x]){
                return false;
            }
        }
        //最后循环遍历结束后,返回true
        return true;
    }
}
