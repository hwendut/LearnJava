package com.heima.demo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        System.out.println("请输入金额");
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入金额有误，请重新输入");
            }
        }
        System.out.println(money);

        String moneyStr = getCapitalNumber(money);
        System.out.println(moneyStr);

        int count = 7 - moneyStr.length();
        for (; count > 0; count--) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        String result = "";
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < 7; i++) {
            result = result + moneyStr.charAt(i) + arr[i];
        }
        System.out.println(result);

    }

    public static String getCapitalNumber(int number) {
        /* 依次获得每一位数转成大写，再拼接在一起
        *  String[] arrCapital = {"零", "壹",...};
        *  String result = "";
        *  再拼起来返回*/
        String result = "";
        String[] arrCapital = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        while (number != 0) {
            int ge = number % 10;
            number = number / 10;
            result = arrCapital[ge] + result;
        }
        return result;
    }
}