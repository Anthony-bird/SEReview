package com.feng._函数式接口04;

import java.util.function.Supplier;
/**
 * Supplier获取最大值
 * */
public class SupplierTest {
    public static void main(String[] args) {
        int[] arr={19,50,28,37,46};

        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;

        });
        System.out.println(maxValue);
    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
