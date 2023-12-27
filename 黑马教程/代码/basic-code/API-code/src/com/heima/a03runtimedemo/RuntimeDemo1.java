package com.heima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1 == r2);
//        r1.exit(0);
//        System.out.println("kan kan wo zhi xing l ma");
//        System.exit();的底层就是Runtime的exit()
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        // shutdown : 关机
        // -s : 默认一分钟后关机
        // -s -t ：指定关机时间
        // -a : 取消关机操作
        // -r : 关机并重启
        Runtime.getRuntime().exec("shutdown -a");



    }
}
