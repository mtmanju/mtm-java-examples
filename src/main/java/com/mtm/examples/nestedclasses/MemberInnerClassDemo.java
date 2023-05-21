package com.mtm.examples.nestedclasses;

public class MemberInnerClassDemo {

    private final int data = 30;

    public static void main(String[] args) {
        MemberInnerClassDemo outer = new MemberInnerClassDemo();
        outer.display();

        // or
        MemberInnerClassDemo.Inner inner = outer.new Inner();
        inner.msg();
    }

    void display() {
        Inner in = new Inner();
        in.msg();
    }

    class Inner {

        void msg() {
            System.out.println("Data is: " + data);
        }
    }

}
