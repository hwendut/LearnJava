package com.heima.sort;

public class BubbleDemo1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4};
        int temp = 0;
        // 外循环：轮数
        // 内循环：逐一比较，并且每一轮次数减一
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
