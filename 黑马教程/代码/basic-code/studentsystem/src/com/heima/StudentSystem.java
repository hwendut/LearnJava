package com.heima;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<User> uList = new ArrayList<>();
        loop1:
        while (true) {
            System.out.println("----------------欢迎来到学生管理系统----------------");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> {
                    if (login(uList)) {
                        break loop1;
                    }
                }
                case "2" -> System.out.println("signup(list);");
                case "3" -> System.out.println("forget(list);");
                default -> System.out.println("没有这个选项");
            }

        }


        ArrayList<Student> list = new ArrayList<>();
        loop2:
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
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    break loop2;
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
            System.out.println("id不存在，删除失败");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入要修改的学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            Student stu = list.get(index);
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            stu.setName(name);
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            stu.setAge(age);
            System.out.println("请输入学生的地址");
            String address = sc.next();
            stu.setAddress(address);
            System.out.println("修改完成");
        } else {
            System.out.println("id不存在，修改失败");
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
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

    public static boolean login(ArrayList<User> list) {
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        String verCodeOri = createVerCode();
        System.out.println(verCodeOri);
        System.out.println("请输入验证码");
        String verCode = sc.next();
        if (!containsUser(list, userName)) {
            System.out.println("用户名未注册，请先注册");
            return false;
        }

        return true;
    }

    public static String createVerCode() {
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
            arr[i + 26] = (char) ('a' + i);
        }

        Random r = new Random();
        char[] result = new char[5];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = arr[r.nextInt(52)];
        }
        int randomIndex = r.nextInt(5);
        result[result.length - 1] = result[randomIndex];
        result[randomIndex] = (char) ('0' + r.nextInt(10));
        return new String(result);
    }

    public static boolean containsUser(ArrayList<User> list, String userName) {
        return getIndexUser(list, userName) >= 0;
    }

    public static int getIndexUser(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (Objects.equals(u.getId(), userName)) {
                return i;
            }
        }
        return -1;
    }
}