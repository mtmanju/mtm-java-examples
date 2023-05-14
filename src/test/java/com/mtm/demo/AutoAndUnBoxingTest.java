package com.mtm.demo;

import org.junit.Test;

public class AutoAndUnBoxingTest {

    @Test
    public void testAutoAndUnBoxing() {

        // Boxing
        int a = 50;
        Integer a2 = Integer.valueOf(a); // Boxing
        Integer a3 = 5; // Boxing
        System.out.println(a2 + " " + a3);

        // Unboxing
        Integer i = Integer.valueOf(50);
        int abc = i;
        System.out.println(abc);

        // Boxing with comparison operator
        Integer in = Integer.valueOf(50);
        if (in < 100) { // unboxing internally
            System.out.println(in);
        }
    }
}
