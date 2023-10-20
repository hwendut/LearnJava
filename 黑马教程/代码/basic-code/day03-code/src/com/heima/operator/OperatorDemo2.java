package com.heima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // << 运算符
        int a = 10;
        System.out.println(a << 1);

        a = -10;
        System.out.println(a << 1);
        // >> 运算符
        a = 10;
        System.out.println(a >> 1);
        a = -10;
        System.out.println(a >> 1);
        System.out.println(a);

        // >>> 运算符
        a = -1;
        System.out.println(a >>> 1);
        System.out.println(a);

        byte b = (byte) 0xff;
        int c = b;
        System.out.println(c);
        System.out.println(b);

//        int f = 0xffffffff;
//        System.out.println(f);
//        int d = -200;
//        byte e = (byte) d;
//        System.out.println(e);

    }
}
