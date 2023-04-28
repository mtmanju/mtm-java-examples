package com.mtm.demo.nestedclasses;

public class AnonymousLocalInnerClassDemo {

    private final int data = 30;// instance variable

    void display() {
        class Local {

            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        AnonymousLocalInnerClassDemo obj = new AnonymousLocalInnerClassDemo();
        obj.display();
    }
}