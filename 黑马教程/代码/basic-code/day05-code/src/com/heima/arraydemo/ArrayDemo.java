package com.heima.arraydemo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[]{11, 12, 13, 14};
        int[] arr2 = {11, 12, 13, 14};

        String[] arr3 = {"zhangsan", "lisi", "wangwu"};
        String[] arr4 = new String[]{"zhangsan", "lisi", "wangwu"};

        double arr5[] = new double[]{1.93, 1.75, 1.73, 1.81};
        double arr6[] = {1.93, 1.75, 1.73, 1.81};

        int[] arr7 = new int[3];
        System.out.println(arr7[0]);
        System.out.println(arr7[1]);
        System.out.println(arr7[2]);

        char[] arr8 = new char[2];
        System.out.println(arr8[0]);
        System.out.println(arr8[1]);

        String[] arr9 = new String[2];
        System.out.println(arr9[0]);
        System.out.println(arr9[1]);
    }
}
