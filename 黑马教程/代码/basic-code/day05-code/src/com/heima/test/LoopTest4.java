package com.heima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        // 扩展需求：保底机制，三次猜不中，直接提示猜中了
        Random r = new Random();
        int number = r.nextInt(100) + 1; // 0~99 -> 1~100
        System.out.println(number);

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("请输入一个1~100之间的数");
            int x = sc.nextInt();

            ++count;
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }

            if (x == number) {
                System.out.println("猜对了");
                break;
            } else if (x > number) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
        }
    }
}