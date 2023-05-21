package com.mtm.examples.constructor;

public class DefaultConstructorDemo {

    DefaultConstructorDemo() {
        System.out.println("Byk is ready");
    }

    DefaultConstructorDemo(String str) {
        System.out.println(str + " is riding the byk");
    }

    public static void main(String[] args) {
        DefaultConstructorDemo dc = new DefaultConstructorDemo("Manju");
        dc.getRidersName();
    }

    void getRidersName() {
        System.out.println("Manju");
    }
}
