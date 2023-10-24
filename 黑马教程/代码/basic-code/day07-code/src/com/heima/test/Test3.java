package com.heima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 在没有规律的数据中随机抽取
        // 可以把数据放入一个数组中，数组的索引是有规律的，按照索引抽取
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; ++i) {
            if (i <= 25) {
                arr[i] = (char) ('a' + i);
            } else {
                arr[i] = (char) ('A' + i - 26);
            }
        }

        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(arr.length);
            result += arr[randomIndex];
        }

        result += r.nextInt(10);

        System.out.println(result);
    }
}
