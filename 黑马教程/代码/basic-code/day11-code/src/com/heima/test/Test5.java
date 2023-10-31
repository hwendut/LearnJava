package com.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
