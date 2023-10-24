package com.heima.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = toArr(num);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        reverseArr(arr);
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

        reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 5;
            } else {
                arr[i] -= 5;
            }
        }

        int number2 = 0;
        for (int i = 0; i < arr.length; i++) {
            number2 = number2 * 10 + arr[i];
        }
        System.out.println(number2);
    }

    public static int[] toArr(int num) {
        int count = 0;
        int temp = num;
        while (num != 0) {
            num /= 10;
            ++count;
        }

        int[] arr = new int[count];
        int i = arr.length - 1;
        while (temp != 0) {
            arr[i] = temp % 10;
            --i;
            temp /= 10;
        }
        return arr;
    }

    public static void reverseArr(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
