package com.mtm.demo.abstraction;

public class AbstaractExample extends AbstractParent {

    public AbstaractExample() {
        System.out.println("AbstaractDemoEx Constructor invoked");
    }

    public static void main(String[] args) {
        AbstractParent abcd = new AbstaractExample();
        abcd.run();
    }

    public void run() {
        System.out.println("Running in sub class");
    }

}

abstract class AbstractParent {

    public AbstractParent() {
        System.out.println("AbstractDemo Constructor invoked");
    }

    public abstract void run();

    public void running() {
    }

}
