package com.heima.demo1;

public class PingPangAth extends Athleter implements English{
    public PingPangAth() {
    }

    public PingPangAth(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void speakEng() {
        System.out.println("说英语");
    }
}
