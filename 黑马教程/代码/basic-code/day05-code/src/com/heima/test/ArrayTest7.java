package com.heima.test;

import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            int index = r.nextInt(arr.length - (i + 1)) + i + 1;
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
