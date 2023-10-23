package com.heima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数x");
        int x = sc.nextInt();

        /*int i = 1;
        while (i <= x / 2) {
            if (i * i <= x) {
                ++i;
            } else {
                break;
            }
        }
        System.out.println("x的平方根是" + (i - 1));*/
        for (int i = 1; i < x; i++) {
            if (i * i == x) {
                System.out.println(x + "的平方根是" + "i");
                break;
            } else if (i * i > x) {
                System.out.println(x + "的平方根的整数部分是" + (i - 1));
                break;
            }
        }
    }


}
