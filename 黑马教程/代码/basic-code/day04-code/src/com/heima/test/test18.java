package com.heima.test;

public class test18 {
    public static void main(String[] args) {
        // 判断回文数
        // 思路：把数字倒过来再和原来的数比较
        int num = 121;
        int temp = num;
        int newNum = 0;
        while (num != 0) {
            // 每一次循环获取num个位上的数，这样就可以做到从右往左依次获得每一位数
            int ge = num % 10;
            num = num / 10;
            // 把数再从左往右加上去
            newNum = newNum * 10 + ge;
        }

        System.out.println(newNum);
        System.out.println(temp == newNum);
    }
}
