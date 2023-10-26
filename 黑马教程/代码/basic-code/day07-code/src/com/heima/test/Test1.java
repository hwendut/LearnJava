package com.heima.test;

import java.util.Objects;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入“头等舱”或“经济舱”");
        String cangwei = sc.next();
        double newPrice = 0;

        if (month >= 5 && month <= 10) {
            newPrice = getNewPrice(cangwei, price, 0.9, 0.85);
        } else {
            newPrice = getNewPrice(cangwei, price, 0.7, 0.65);
        }

        System.out.println("新价格是" + newPrice);
    }

    private static double getNewPrice(String cangwei, double price, double x, double x1) {
        double newPrice = 0;
        if (Objects.equals(cangwei, "头等舱")) {
            return price * x;
        } else {
            return price * x1;
        }
    }
}
