package com.demo.inheritance;

public class B extends A {

    int k;

    public void showk() {
        System.out.println("k: " + k);
    }

    public void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
