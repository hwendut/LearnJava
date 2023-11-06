package com.heima;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();

    }
}

class Fu {
    String hecha = "hecha";
}

class Zi extends Fu {
    String name = "Zi";

    public Zi() {
       // super();
        this("zi");
    }

    public Zi(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(super.hecha);
    }
}

