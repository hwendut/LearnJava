package com.heima.search;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean result = basicSearch(arr, 3);
        System.out.println(result);
    }

    private static boolean basicSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
