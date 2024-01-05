package com.heima.sort;

import java.util.Random;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr, start, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int i = start;
        int j = end;
        // 基准数放在第一个的时候，且从小到大排序时，需要先找end
        while (end > start) {
            while (end > start) {
                if (arr[end] < arr[i]) {
                    break;
                }
                --end;
            }

            while (start < end) {
                if (arr[start] > arr[i]) {
                    break;
                }
                ++start;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
