package com.mtm.examples.nestedclasses;

public class StaticNestedClassDemo {

    static int data = 30;

    public static void main(String[] args) {

        // non-static method access
        StaticNestedClassDemo.Inner obj = new StaticNestedClassDemo.Inner();
        obj.msg();

        // static method access
        StaticNestedClassDemo.Inner.message();
    }

    static class Inner {

        static void message() {
            System.out.println("Static method");
        }

        void msg() {
            System.out.println("Data: " + data);
        }
    }
}
