package com.feng._冒泡排序;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr={24,69,80,57,13};
        System.out.println("排序前" + arraryToString(arr));

        for (int x=0;x<arr.length-1;x++){
            for (int i =0;i<arr.length-1-x;i++){
                if (arr[i] >arr[i+1]){
                    int temp=arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("排序后" + arraryToString(arr));
    }

    private static String arraryToString(int[] arr) {
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                b.append(arr[i]);
            } else {
                b.append(arr[i]).append(", ");
            }
        }
        b.append("]");
        String s = b.toString();
        return s;
    }
}
