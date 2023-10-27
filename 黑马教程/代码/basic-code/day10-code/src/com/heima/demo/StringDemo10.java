package com.heima.demo;

public class StringDemo10 {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";

        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7, 11);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
