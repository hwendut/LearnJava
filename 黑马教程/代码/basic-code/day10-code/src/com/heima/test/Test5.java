package com.heima.test;

public class Test5 {
    public static void main(String[] args) {
        /* 给定两个以字符串形式表示的非负数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串的形式*/
        String num1 = "1234";
        String num2 = "4567";
        int iNum1 = toInt(num1);
        int iNum2 = toInt(num2);
        String result = iNum1 * iNum2 + "";
        System.out.println(result);
    }

    public static int toInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + str.charAt(i) - '0';
        }
        return result;
    }
}
