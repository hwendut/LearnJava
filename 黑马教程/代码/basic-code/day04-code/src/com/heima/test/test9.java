package com.heima.test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几");
        int week = sc.nextInt();

        switch (week) {
            default:
                System.out.println("没有这个星期");
                break;
            case 1:
                System.out.println("游泳");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("健走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("跑步");
                break;
            case 6:
            case 7:
                System.out.println("休息");
                break;
            /*default:
                System.out.println("没有这个星期");*/
        }

        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
