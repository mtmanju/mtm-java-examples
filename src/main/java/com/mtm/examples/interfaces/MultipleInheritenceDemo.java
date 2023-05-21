package com.mtm.examples.interfaces;

public class MultipleInheritenceDemo implements InterfaceDemo2, InterfaceDemo {

    public static void main(String[] args) {
        MultipleInheritenceDemo m = new MultipleInheritenceDemo();
        m.print();
        m.show();
        m.mmt();
    }

    public void show() {
        System.out.println("Show");
    }

    public void print() {
        System.out.println("Print");
    }

    public void mmt() {
        System.out.println("MMT");
    }

}
