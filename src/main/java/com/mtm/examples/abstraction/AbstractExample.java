package com.mtm.examples.abstraction;

public class AbstractExample extends AbstractParent {

    public AbstractExample() {
        System.out.println("AbstaractDemoEx Constructor invoked");
    }

    public static void main(String[] args) {
        AbstractParent abcd = new AbstractExample();
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
