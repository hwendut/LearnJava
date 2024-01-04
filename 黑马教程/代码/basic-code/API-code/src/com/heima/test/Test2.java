package com.heima.test;

public class Test2 {
    public static void main(String[] args) {
        String str = "123789";

        if (!str.matches("[1-9]\\d{0,9}|0")) {
            System.out.println("输入有误");
        } else {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                num = num * 10 + (c - '0');
            }
            System.out.println(num);
        }
    }
}
