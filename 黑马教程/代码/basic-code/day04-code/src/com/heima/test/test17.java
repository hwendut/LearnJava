package com.heima.test;

public class test17 {
    public static void main(String[] args) {
        int count = 0;
        double height = 0.1;
        while (height < 8844430) {
            height = height * 2;
            ++count;
        }

        System.out.println("折叠" + count + "次可以折成珠穆朗玛峰的高度");
    }
}
