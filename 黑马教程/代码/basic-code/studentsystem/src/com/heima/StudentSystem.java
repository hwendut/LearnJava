package com.heima;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("----------------欢迎来到学生管理系统-----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent();
                case "4" -> queryStudent(list);
                case "5" -> {
                    break loop;
                }

                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id");
            String id = sc.next();

            if (!contains(list, id)) {
                stu.setId(id);
                System.out.println("请输入学生的姓名");
                String name = sc.next();
                stu.setName(name);
                System.out.println("请输入学生的年龄");
                int age = sc.nextInt();
                stu.setAge(age);
                System.out.println("请输入学生的家庭住址");
                String address = sc.next();
                stu.setAddress(address);

                list.add(stu);
                System.out.println("添加成功");
                break;
            } else {
                System.out.println("该学生已存在");
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入要删除的学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("id不存在");
        }
    }

    public static void updateStudent() {
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (Objects.equals(s.getId(), id)) {
                return i;
            }
        }
        return -1;
    }
}
