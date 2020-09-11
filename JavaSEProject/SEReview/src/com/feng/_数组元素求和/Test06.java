package com.feng._数组元素求和;
/**
 * 需求：
 *    元素是{68,27,95，88，171，996，51,210}  求出该数组满足该要求的元素和
 *    要求是：  个位和十位都不能是7，并且只能是偶数
 *  思路:
 *     定义一个数组，用静态初始化完成数组元素初始化
 *     定义一个数组变量，初始值为0
 *      遍历数组，获取到数组每一个元素
 *      判断 累计求和
 *      */
public class Test06 {
    public static void main(String[] args) {
        int []arr={68,27,95,88,171,996,51,210};
        int sum = 0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]%10!=7 && arr[i]/10%10 !=7 && arr[i]%2 == 0){
                sum+= arr[i];
            }
        }
        System.out.println(sum);
    }
}
