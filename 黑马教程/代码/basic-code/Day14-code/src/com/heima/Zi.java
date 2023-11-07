package com.heima;

public class Zi extends Fu implements Swim{
    public Zi() {
    }

    public Zi(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Zi");
    }

    @Override
    public void swim() {
        System.out.println("erzizaiyouyong");
    }

    public void eat() {
        System.out.println("eat");
    }
}
