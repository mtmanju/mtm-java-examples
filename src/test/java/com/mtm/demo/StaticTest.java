package com.mtm.demo;

public class StaticTest {

    /** A static variable */
    @SuppressWarnings("unused")
    private static final int num;

    /** A static block */
    static {
        num = 20;
        System.out.println("Inside static block");
    }

    /** Constructor */
    public StaticTest() {
        System.out.println("Inside Constructor");
    }

    public static void myStaticMethod() {
        System.out.println("Inside static func");

    }

    public void myNonStaticMethod() {
        System.out.println("Inside non static func");
    }

    public static void main(String[] args) {
        StaticTest.myStaticMethod();
        StaticTest test = new StaticTest();
        test.myNonStaticMethod();
    }
}