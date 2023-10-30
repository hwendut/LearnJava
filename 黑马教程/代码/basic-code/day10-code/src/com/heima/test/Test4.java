package com.heima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /* 生成验证码
         * 内容：可以是小写字母，可以是大写字母，可以是数字
         * 规则：
         * 长度为5
         * 内容中是四位字母，一位数字
         * 数字可以出现在任意位置*/
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
            arr[i + 26] = (char) ('a' + i);
        }

        Random r = new Random();
        char[] result = new char[5];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = arr[r.nextInt(52)];
        }
        int randomIndex = r.nextInt(5);
        result[result.length - 1] = result[randomIndex];
        result[randomIndex] = (char) ('0' + r.nextInt(10));
        System.out.println(new String(result));
    }
}
