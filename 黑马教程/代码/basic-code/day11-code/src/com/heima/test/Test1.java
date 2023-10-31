package com.heima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.print('[');
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
