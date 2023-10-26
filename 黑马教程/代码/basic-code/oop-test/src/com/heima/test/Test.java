package com.heima.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhansan", 23);
//        Student stu2 = new Student(2, "lisi", 24);
//        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
//        arr[1] = stu2;
//        arr[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 26);
        if (!contains(arr, stu4)) {
            if (arr[arr.length - 1] != null) {
                System.out.println("原数组已满");
                Student[] newArr = new Student[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[newArr.length - 1] = stu4;
                arr = newArr;
            } else {
                System.out.println("原数组未满");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == null) {
                        arr[i] = stu4;
                        break;
                    }
                }
            }
        } else {
            System.out.println("学生已经存在");
        }

        printArr(arr);

        // 1.获得学生id
        System.out.println("请输入要删除的学生id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        // 2.判断学生id是否存在
        int index = contains(arr, id);
        if (index == -1) {
            System.out.println("删除失败");
        } else {
            for (int i = index; arr[i] != null; ++i) {
                arr[i] = arr[i + 1];
            }
        }
        // 2.1 不存在，删除失败
        // 2.2 存在，删除，从后往前移动

        printArr(arr);

        index = contains(arr, 1);
        if (index == -1) {
            System.out.println("不存在该学生");
        } else {
            arr[index].setAge(arr[index].getAge() + 1);
        }
        printArr(arr);
    }

    private static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
            } else {
                break;
            }
        }
    }

    public static boolean contains(Student[] arr, Student stu) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (stu.getId() == arr[i].getId()) {
                    flag = true;
                    break;
                }
            } else {
                break;
            }
        }
        return flag;
    }

    public static int contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (id == arr[i].getId()) {
                    return i;
                }
            } else {
                break;
            }
        }
        return -1;
    }
}
