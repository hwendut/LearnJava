package com.heima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        // 需求：键盘录入三位数，获取其中的个位、十位、百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        // 获取个位、十位、百位
        // 数字除10再模10
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;

        System.out.println("个位是" + ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);
    }
}
