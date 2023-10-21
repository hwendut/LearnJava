package com.heima.test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号");
        int ticket = sc.nextInt();
        if (ticket <= 100 && ticket >=0) {
            if (ticket % 2 == 0) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        } else {
            System.out.println("无效票");
        }
    }
}
