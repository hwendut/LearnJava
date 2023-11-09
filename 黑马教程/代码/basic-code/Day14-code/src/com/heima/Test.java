package com.heima;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Fu a = new Zi();
        a.print();
        // a.eat();
        Zi b = new Zi("zhangsan");
        b.printFu();
        b.eat();*/

        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
