package com.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if (num < 1 || num > 100) {
                System.out.println("输入的数不在1~100，请重新输入");
                continue;
            }
            sum += num;
            arr.add(num);
            if (sum > 200) {
                break;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
