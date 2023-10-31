package com.heima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("zhansan", 24);
        Student stu2 = new Student("lisi", 25);
        Student stu3 = new Student("wangwu", 26);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
