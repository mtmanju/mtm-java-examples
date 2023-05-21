package com.mtm.examples.nestedclasses;

public class AnonymousLocalInnerClassDemo {

    private final int data = 30;// instance variable

    public static void main(String[] args) {
        AnonymousLocalInnerClassDemo obj = new AnonymousLocalInnerClassDemo();
        obj.display();
    }

    void display() {
        class Local {

            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
}