package com.heima;

abstract public class Fu {
    private String name;

    public Fu() {
    }

    public Fu(String name) {
        this.name = name;
    }

    abstract public void print();

    final public void printFu() {
        System.out.println(this.name);
    }
}
