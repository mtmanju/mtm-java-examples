package com.demo.nestedclasses;

public class StaticNestedClassDemo {

    static int data = 30;

    static class Inner {

        void msg() {
            System.out.println("Data: " + data);
        }

        static void message() {
            System.out.println("Static method");
        }
    }

    public static void main(String[] args) {

        // non-static method access
        StaticNestedClassDemo.Inner obj = new StaticNestedClassDemo.Inner();
        obj.msg();

        // static method access
        StaticNestedClassDemo.Inner.message();
    }
}
