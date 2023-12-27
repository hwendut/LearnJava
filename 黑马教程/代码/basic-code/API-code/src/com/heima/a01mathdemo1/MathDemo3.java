package com.heima.a01mathdemo1;

public class MathDemo3 {
    // clac how many shuixianhua number
    // 100 ~ 999

    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            // judge
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                ++count;
            }
        }
        System.out.println(count);

        // why there is no two zimishu
        count = 0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;

            // judge
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sum == i) {
                ++count;
            }
        }
        System.out.println(count);

        // how many siyemeiguishu
        count = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            // judge
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                ++count;
            }
        }
        System.out.println(count);

        // how many wujiaoxingshu
        count = 0;
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            // judge
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (sum == i) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
