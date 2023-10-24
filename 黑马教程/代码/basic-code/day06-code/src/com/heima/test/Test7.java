package com.heima.test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 1;
        if (contains(arr, target)) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }

    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
