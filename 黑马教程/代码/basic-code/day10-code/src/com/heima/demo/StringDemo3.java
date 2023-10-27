package com.heima.demo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        System.out.println(str);
        int upCount = 0;
        int downCount = 0;
        int digCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                downCount++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digCount++;
            }
        }

        System.out.println("大写字母出现了" + upCount + "次");
        System.out.println("小写字母出现了" + downCount + "次");
        System.out.println("数字出现了" + digCount + "次");
    }
}
