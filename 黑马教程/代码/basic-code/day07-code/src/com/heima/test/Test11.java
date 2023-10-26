package com.heima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] userArr = userInputNumber();

        int blueCount = 0;
        int redCount = 0;

        for (int i = 0; i < userArr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == userArr[i]) {
                    ++redCount;
                    break;
                }
            }
        }

        if (arr[arr.length - 1] == userArr[arr.length - 1]) {
            ++blueCount;
        }

        System.out.println(redCount);
        System.out.println(blueCount);
        switch (redCount) {
            case 6:
                if (blueCount == 1) {
                    System.out.println("一等奖，最高1000万");
                } else {
                    System.out.println("二等奖，最高500万");
                }
                break;
            case 5:
                if (blueCount == 1) {
                    System.out.println("三等奖，3000元");
                } else {
                    System.out.println("四等奖，200元");
                }
                break;
            case 4:
                if (blueCount == 1) {
                    System.out.println("四等奖，200元");
                } else {
                    System.out.println("五等奖，10元");
                }
                break;
            case 3:
            case 2:
                if (blueCount == 1) {
                    System.out.println("五等奖，10元");
                } else {
                    System.out.println("未中奖");
                }
                break;
            case 1:
            case 0:
                if (blueCount == 1) {
                    System.out.println("六等奖，5元");
                } else {
                    System.out.println("未中奖");
                }
                break;
            default:
                System.out.println("彩票号码有误");
                break;
        }
    }

    public static int[] userInputNumber() {
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                if (!contains(arr, redNumber)) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前号码已经存在");
                }
            } else {
                System.out.println("当前号码超出范围");
            }
        }

        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 33) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前号码超出范围");
            }
        }

        return arr;
    }

    public static int[] createNumber() {
        // 6红，1蓝
        int[] arr = new int[7];

        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1; // 1~33
            if (!contains(arr, redNumber)) {
                arr[i] = redNumber;
                ++i;
            }
        }

        arr[arr.length - 1] = r.nextInt(16) + 1;

        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
