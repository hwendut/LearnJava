package com.heima.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数据的和是" + sum);

        int avg = sum / arr.length;
        System.out.println("所有数据的平均数是" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                ++count;
            }
        }
        System.out.println("比平均值小的数有" + count + "个");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
