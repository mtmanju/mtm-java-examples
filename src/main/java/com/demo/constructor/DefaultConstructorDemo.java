package com.demo.constructor;

public class DefaultConstructorDemo {

    DefaultConstructorDemo() {
        System.out.println("Byk is ready");
    }

    DefaultConstructorDemo(String str) {
        System.out.println(str + " is riding the byk");
    }

    void getRidersName() {
        System.out.println("Manju");
    }

    public static void main(String[] args) {
        DefaultConstructorDemo dc = new DefaultConstructorDemo("Manju");
        dc.getRidersName();
    }
}
