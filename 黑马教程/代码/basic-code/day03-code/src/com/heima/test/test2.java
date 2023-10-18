package com.heima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /* 6是一个真正伟大的数字，键盘录入两个整数，
         * 如果其中一个为6，最终结果输出为true，
         * 如果他们的和为6的倍数，最终结果输出为true，
         * 其他情况输出false
         */

        // 键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 判断
        System.out.println(a == 6 || b == 6 || (a + b) % 6 == 0);
    }
}
