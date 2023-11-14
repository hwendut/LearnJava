package com.heima.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 需求：
        // 把一个一维数组中的数据：0~15，打乱顺序
        // 然后再按照4个一组的方式添加到二维数组中

        // 定义一维数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 打乱数组中的数据的顺序
        // 遍历数组，得到每一个元素，再将该元素和随机索引上的数据交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int randomIndex = r.nextInt(arr.length);
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        // 遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 创建二维数组
        int[][] data = new int[4][4];

        /*// 解法1
        for (int i = 0; i < arr.length; i++) {
            data[i / 4][i % 4] = arr[i];
        }*/

        // 解法2
        // 遍历二维数组，给二维数组的每一个数据赋值
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = arr[i * 4 + j];
            }
        }
        
        // 遍历data
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
