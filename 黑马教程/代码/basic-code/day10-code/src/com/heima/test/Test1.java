package com.heima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /* 键盘录入一个字符串
         *  要求1：长度小于等于9
         *  要求2：只能是数字
         *  将内容变成罗马数字
         *  罗马数字里面没有0
         *  如果键盘录入的数字包含0，可以变成""（长度为0的字符串）*/
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            if (checkStr(str)) {
                break;
            } else {
                continue;
            }
        }
        // System.out.println(str);
        System.out.println(toLuoma(str));
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static String toLuoma(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String str1 = switch (str.charAt(i)) {
                case '0' -> "";
                case '1' -> " I ";
                case '2' -> " II ";
                case '3' -> " III ";
                case '4' -> " IV ";
                case '5' -> " V ";
                case '6' -> " VI ";
                case '7' -> " VII ";
                case '8' -> " VIII ";
                case '9' -> " IX ";
                default -> "";
            };
            sb.append(str1);
        }
        return sb.toString();
    }
    /*public static String toLuoma(String str) {
        StringBuilder sb = new StringBuilder();
        String[] arr = {"", " I ", " II ", " III ", " IV ", " V ", " VI ", " VII ", " VIII ", " IX "};
        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[str.charAt(i) - 48]);
        }
        return sb.toString();
    }*/
}