package com.heima.a01mathdemo1;

import java.util.Scanner;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
