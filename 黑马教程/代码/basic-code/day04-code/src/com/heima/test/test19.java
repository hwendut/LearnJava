package com.heima.test;

public class test19 {
    public static void main(String[] args) {
        // 求商和余数
        // 给定两个整数，被除数和除数（都是正数，且不超过int的范围），
        // 将两数相除，要求不适用乘法、除法和 % 运算符，得到商和余数
        /*int beichu = 11;
        int chu = 5;
        int shang = 0;
        int yushu = 0;
        int sum = 0;

        while (sum < beichu) {
            sum += chu;
            ++shang;
        }
        yushu = chu - (sum - beichu);
        System.out.println(shang - 1);
        System.out.println(yushu);*/
        int dividend = 100;
        int divisor = 37;
        int count = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++count;
        }

        System.out.println(dividend);
        System.out.println(count);
    }
}
