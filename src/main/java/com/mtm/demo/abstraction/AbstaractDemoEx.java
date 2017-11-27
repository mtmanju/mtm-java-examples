package com.mtm.demo.abstraction;

public class AbstaractDemoEx extends AbstractDemo {

    public AbstaractDemoEx() {
        System.out.println("AbstaractDemoEx Constructor invoked");
    }

    public void run() {
        System.out.println("Running in sub class");
    }

    public static void main(String[] args) {
        AbstractDemo abcd = new AbstaractDemoEx();
        abcd.run();
    }

}
