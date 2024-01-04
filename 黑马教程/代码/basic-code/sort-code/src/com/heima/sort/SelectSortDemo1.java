package com.heima.sort;

public class SelectSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4};
        int temp = 0;
        // 外循环：轮数
        // 内循环：从还未确定的位置开始逐一比较
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
