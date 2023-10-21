package com.heima.test;

public class test2 {
    public static void main(String[] args) {
        boolean isRedLight = true;
        boolean isGreenLight = true;
        boolean isYellowLight = true;

        if (isGreenLight) {
            System.out.println("GoGoGo!");
        }

        if (isRedLight) {
            System.out.println("Stop!");
        }

        if (isYellowLight) {
            System.out.println("Slow!");
        }
    }
}
