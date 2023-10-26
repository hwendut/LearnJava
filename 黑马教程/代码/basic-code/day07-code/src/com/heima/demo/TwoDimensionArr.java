package com.heima.demo;

public class TwoDimensionArr {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7}
        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[2][3];
        int x = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = x++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
