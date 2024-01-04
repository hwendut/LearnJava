package com.heima.search;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int num = 0;
        ArrayList<Integer> result = basicSearch(arr, num);
        System.out.println(result);
    }

    private static ArrayList<Integer> basicSearch(int[] arr, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }
        return list;
    }
}
