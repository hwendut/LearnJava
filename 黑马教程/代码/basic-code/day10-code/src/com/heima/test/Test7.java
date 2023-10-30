package com.heima.test;

public class Test7 {
    public static void main(String[] args) {
        /* 给一个字符串s，由若干单词组成，单词前后用一些空格字符隔开
         * 返回字符串中最后一个单词的长度
         * 单词是指仅有字母组成、不包含任何空格字符的最大子字符串*/

        // 倒着遍历
        String str = "hello  world  a   ";
        boolean flag = false;
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (flag && str.charAt(i) != ' ') {
                ++count;
            } else if (flag && str.charAt(i) == ' ') {
                break;
            } else if (!flag && str.charAt(i) != ' '){
                flag = true;
                ++count;
            }
        }
        System.out.println(count);
    }
}
