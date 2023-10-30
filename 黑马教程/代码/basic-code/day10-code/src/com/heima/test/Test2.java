package com.heima.test;

public class Test2 {
    public static void main(String[] args) {
        /* 调整字符串
         * 给定两个字符串,A 和 B。
         * A的旋转操作就是将 A最左边的字符移动到最右边。
         * 例如，若 A='abcde'，在移动一次之后结果就是'bcdea'。
         * 如果在若干次调整操作之后，A能变成B，那么返回True。
         * 如果不能匹配成功，则返回false。*/
        String A = "abcde";
        String B = "bcdea";
        System.out.println(check(A, B));
    }

    /*public static boolean rotate(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = A.substring(1) + A.charAt(0);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }*/

    // 方法2：把字符串变成一个字符数组，然后调整字符数组里面的数据，最后再把字符数组变成字符串
    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        return new String(arr);
    }

    public static boolean check(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }
}
