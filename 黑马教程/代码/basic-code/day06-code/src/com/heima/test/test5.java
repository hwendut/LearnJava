package com.heima.test;

public class test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
