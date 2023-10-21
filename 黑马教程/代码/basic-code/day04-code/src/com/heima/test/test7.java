package com.heima.test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级");
        int level = sc.nextInt();
        int price = 1000;


        if (level == 1) {
            System.out.println("打完折后的价格是：" + price * 0.6);
        } else if (level == 2) {
            System.out.println("打完折后的价格是：" + price * 0.7);
        } else if (level == 3) {
            System.out.println("打完折后的价格是：" + price * 0.8);
        } else {
            System.out.println("非会员");
        }
    }

}
