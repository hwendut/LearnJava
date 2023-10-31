package com.heima.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("001", "zhansan", "123456");
        User u2 = new User("002", "wangwu", "12345678");
        User u3 = new User("003", "lisi", "1234qwer");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        String id = "002";
        System.out.println(check(list, id));
    }

    public static int check(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
