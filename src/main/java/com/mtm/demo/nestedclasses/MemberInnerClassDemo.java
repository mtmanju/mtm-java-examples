package com.mtm.demo.nestedclasses;

public class MemberInnerClassDemo {

    private final int data = 30;

    class Inner {

        void msg() {
            System.out.println("Data is: " + data);
        }
    }

    void display() {
        Inner in = new Inner();
        in.msg();
    }

    public static void main(String[] args) {
        MemberInnerClassDemo outer = new MemberInnerClassDemo();
        outer.display();

        // or
        MemberInnerClassDemo.Inner inner = outer.new Inner();
        inner.msg();
    }

}
