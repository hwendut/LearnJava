package com.heima.sort;

public class InsertSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4};
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

    }
}
