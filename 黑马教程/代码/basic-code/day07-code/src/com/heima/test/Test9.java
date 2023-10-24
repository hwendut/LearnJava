package com.heima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        int[] arr1 = {2, 588, 888, 1000, 10000};
        int[] arr2 = new int[arr1.length];

        Random r = new Random();
        for (int i = 0; i < arr1.length;) {
            int randomIndex = r.nextInt(arr1.length);
            boolean flag = false;
            for (int j = 0; j < arr2.length; ++j) {
                if (arr2[j] == arr1[randomIndex]) {
                    flag = true;
                }
            }
            if (!flag) {
                arr2[i] = arr1[randomIndex];
                System.out.println(arr1[randomIndex]);
                ++i;
            }
        }
    }
}
