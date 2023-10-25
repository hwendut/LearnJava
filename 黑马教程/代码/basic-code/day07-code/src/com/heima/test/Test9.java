package com.heima.test;

import java.util.Random;

public class Test9 {
    /*public static void main(String[] args) {
        int[] arr1 = {2, 588, 888, 1000, 10000};
        int[] arr2 = new int[arr1.length];

        Random r = new Random();
        for (int i = 0; i < arr1.length;) {
            int randomIndex = r.nextInt(arr1.length);

            if (!contains(arr2, arr1[randomIndex])) {
                arr2[i] = arr1[randomIndex];
                System.out.println(arr1[randomIndex]);
                ++i;
            }
        }
    }

    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }*/

    public static void main(String[] args) {
        int[] arr1 = {2, 588, 888, 1000, 10000};
        Random r = new Random();

        for (int i = 0; i < arr1.length; i++) {
            int randomIndex = r.nextInt(arr1.length);
            int temp = arr1[i];
            arr1[i] = arr1[randomIndex];
            arr1[randomIndex] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
