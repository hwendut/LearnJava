package com.heima.a02systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        // 计算机中的时间原点 1970年1月1日 00:00:00
        // 也是C语言的生日
        // 在我国东八区 1970年1月1日 08:00:00
        // 1s = 1000ms
//        System.exit(0);
//        System.out.println("kan kan wo zhi xing l ma");

        long l = System.currentTimeMillis();
        System.out.println(l);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

        System.arraycopy(arr1, 6, arr2, 2, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        // 1.如果数据源数组和目的数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        // 2.在拷贝的时候需要考虑数组的长度，否则会报错，数组越界错误
        // 3.如果数据源数组和目的数组都是引用数据类型，那么子类类型可以赋值给父类类型
    }
}
