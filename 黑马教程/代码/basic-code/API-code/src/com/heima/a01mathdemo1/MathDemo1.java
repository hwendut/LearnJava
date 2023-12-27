package com.heima.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        // abs(a)
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        // bug
        // int : -2147483648 ~ 2147483648
        System.out.println(Math.abs(-2147483648)); // error
        System.out.println(Math.abs(-2147483647));
//        System.out.println(Math.absExact(-2147483648));

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.54));
        System.out.println("================");
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.54));
        System.out.println("================");
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        // max(a, b)
        System.out.println(Math.max(20, 30));
        System.out.println("================");
        // min(a, b)
        System.out.println(Math.min(20, 30));
        System.out.println("================");

        // pow(a, b)
        // note : 第二个参数建议为大于等于1的正整数
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2, -2));

        // sqrt(a)
        // cbrt(a)
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));

        // random()
        System.out.println("================");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
