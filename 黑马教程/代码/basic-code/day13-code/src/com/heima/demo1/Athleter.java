package com.heima.demo1;

public abstract class Athleter extends Person{
    public Athleter() {
    }

    public Athleter(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}
