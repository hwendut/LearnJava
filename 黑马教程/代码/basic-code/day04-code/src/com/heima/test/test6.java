package com.heima.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐园");
            } else if (score >= 80 && score <= 89) {
                System.out.println("送大黄蜂");
            } else {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("不合法");
        }

    }

}
