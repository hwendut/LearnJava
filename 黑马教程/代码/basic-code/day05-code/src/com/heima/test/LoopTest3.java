package com.heima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int x = sc.nextInt();

        /*boolean flag = false;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.println(x + "不是质数");
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println(x + "是质数");
        }*/
        boolean flag = true;
        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                flag = false;
                break;

            }
        }
        if (flag) {
            System.out.println(x + "是质数");
        } else {
            System.out.println(x + "不是质数");
        }

        // 优化
        /* for (i = 1; i <= x的平方根; ++i) {
        * }
        */
    }
}
