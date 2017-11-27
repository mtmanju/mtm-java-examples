package com.mtm.demo;

public class AutoboxingandUnboxingDemo {

    public static void main(String args[]) {

        // Boxing
        int a = 50;
        Integer a2 = new Integer(a); // Boxing
        Integer a3 = 5; // Boxing
        System.out.println(a2 + " " + a3);

        // Unboxing
        Integer i = new Integer(50);
        int abc = i;
        System.out.println(abc);

        // Boxing with comparison operator
        Integer in = new Integer(50);
        if (in < 100) { // unboxing internally
            System.out.println(in);
        }
    }
}
