package com.heima.demo;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk = "你玩的真彩，TMD";
        String result = talk.replace("TMD", "***");
        System.out.println(result);
        byte[] arr = {1, 2, 3};
        String str = new String(arr);
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        String str1 = "";
        sb.append(str1);
        System.out.println(sb);
    }
}
