package com.heima;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }

    public void show() {
        int a = 20;

        class Inner{
            int a = 30;
            public void method() {
                System.out.println(a);
                System.out.println(this.a);
                System.out.println(Outer.this.a);
            }
        }

        Inner i = new Inner();
        i.method();
    }
}
