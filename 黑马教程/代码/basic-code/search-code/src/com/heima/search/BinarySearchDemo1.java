package com.heima.search;

public class BinarySearchDemo1 {
    // 二分查找的优势在于提高查找效率
    /*注意：如果数据是乱的，先用排序再用二分查找得到的索引没有实际意义，只能确定
    当前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了*/
    // 优化1：mid = min + (num - arr[min]) / (arr[max] - arr[min]) * (max - min);
    // 即插值查找，但是要求数据的分布比较均匀，否则会降低查找效率
    // 优化2：mid = min + 黄金分割点左半边长度 - 1;
    //        mid = min + (max - min) * 0.618 - 1;
    // 即斐波那契查找
    // 上述三种查找
    // 相同点：不断缩小范围
    // 不同点：计算mid的方式不一样
    // 分块查找 和它的扩展：哈希查找
    // 树表查找
    public static void main(String[] args) {
        // 前提是数据有序
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = 0;
        int result = binarySearch(arr, num);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        // 防止溢出
        int mid = 0;
        while (min <= max) {
            mid = min + (max - min) / 2;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
