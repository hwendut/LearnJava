package com.heima;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        // 登录界面
        ArrayList<User> uList = new ArrayList<>();
        loop1:
        while (true) {
            System.out.println("----------------欢迎来到学生管理系统----------------");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> {
                    if (login(uList)) {
                        System.out.println("登录成功");
                        break loop1;
                    } else {
                        System.out.println("登录失败");
                    }
                }
                case "2" -> {
                    signup(uList);
                    System.out.println("注册成功");
                }
                case "3" -> {
                    if (forget(uList)) {
                        System.out.println("密码修改成功，请重新登录");
                    } else {
                        System.out.println("密码修改失败");
                    }
                }
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }

        }

        // 管理界面
        ArrayList<Student> list = new ArrayList<>();
        loop2:
        while (true) {
            System.out.println("----------------欢迎来到学生管理系统----------------");
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
            if (s.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean login(ArrayList<User> list) {
        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
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

            while (true) {
                if (!verCode.equals(verCodeOri)) {
                    System.out.println("验证码有误，请重新输入验证码");
                    verCodeOri = createVerCode();
                    System.out.println(verCodeOri);
                    verCode = sc.next();
                } else {
                    break;
                }
            }

            int count = 0;
            int index = getIndexUser(list, userName);
            User u = list.get(index);
            while (true) {
                if (!u.getPassword().equals(password)) {
                    count++;
                    if (count == 3) {
                        return false;
                    }
                    System.out.println("用户名和密码错误，还剩" + (3 - count) + "次机会");
                    System.out.println("请输入密码");
                    password = sc.next();
                } else {
                    break loop;
                }
            }
        }

        return true;
    }

    public static void signup(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String userName = "";
        while (true) {
            System.out.println("请输入用户名");
            userName = sc.next();
            // 检查用户名，没有问题则进入下一步
            if (checkUserName(list, userName)) {
                break;
            }
        }
        System.out.println("用户名√");

        String password = "";
        String passwordAgain = "";
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();

            System.out.println("再次输入密码");
            passwordAgain = sc.next();

            if (password.equals(passwordAgain)) {
                break;
            } else {
                System.out.println("两次输入密码不一致");
            }
        }
        System.out.println("密码√");

        String id = "";
        while (true) {
            System.out.println("请输入身份证号");
            id = sc.next();
            if (checkId(id)) {
                break;
            }
        }
        System.out.println("身份证号码√");

        String phoneNumber = "";
        while (true) {
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            if (checkPhoneNumber(phoneNumber)) {
                break;
            }
        }
        System.out.println("手机号√");

        User u = new User(userName, password, id, phoneNumber);
        list.add(u);
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
            if (u.getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkUserName(ArrayList<User> list, String userName) {
        if (userName.length() < 3 || userName.length() > 15) {
            System.out.println("用户名长度必须在3~15位之间，请重新输入");
            return false;
        }
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (c < '0' || (c > '9' && c < 'A') || (c > 'Z' && c < 'a') || c > 'z') {
                return false;
            }
            if (c > '0' && c < '9') {
                count++;
            }
        }
        if (count == userName.length()) {
            System.out.println("用户名不能是纯数字，请重新输入");
            return false;
        }
        if (containsUser(list, userName)) {
            System.out.println("用户名已存在，请重新输入");
            return false;
        }

        return true;
    }

    public static boolean checkId(String id) {
        if (id.length() != 18) {
            System.out.println("身份证号码需为18位");
            return false;
        }

        if (id.charAt(0) == '0') {
            System.out.println("身份证号码不能以0开头");
            return false;
        }

        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("第" + (i + 1) + "位不是数字（前17位必须是数字）");
                return false;
            }
        }

        char c = id.charAt(id.length() - 1);
        if (!((c >= '0' && c <= '9') || c == 'X' || c == 'x')) {
            System.out.println("最后一位不是数字或X，x");
            return false;
        }

        return true;
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            System.out.println("手机号码需为11位");
            return false;
        }

        if (phoneNumber.charAt(0) == '0') {
            System.out.println("手机号码不能以0开头");
            return false;
        }

        for (int i = 0; i < phoneNumber.length() - 1; i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("第" + (i + 1) + "位不是数字（必须都是数字）");
                return false;
            }
        }

        return true;
    }

    public static boolean forget(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String userName = sc.next();

        int index = getIndexUser(list, userName);

        if (index < 0) {
            System.out.println("未注册");
            return false;
        }

        User u = list.get(index);

        System.out.println("请输入身份证号码");
        String id = sc.next();

        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        if (!(id.equals(u.getId()) && phoneNumber.equals(u.getPhoneNumber()))) {
            System.out.println("账号信息不匹配");
            return false;
        }

        while (true) {
            System.out.println("请输入新密码");
            String password = sc.next();

            System.out.println("再次输入新密码");
            String passwordAgain = sc.next();

            if (password.equals(passwordAgain)) {
                u.setPassword(password);
                break;
            } else {
                System.out.println("两次输入密码不一致");
            }
        }

        return true;
    }
}