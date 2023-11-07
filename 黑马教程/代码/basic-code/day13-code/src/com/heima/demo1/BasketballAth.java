package com.heima.demo1;

public class BasketballAth extends Athleter{
    public BasketballAth() {
    }

    public BasketballAth(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学习打篮球");
    }
}
