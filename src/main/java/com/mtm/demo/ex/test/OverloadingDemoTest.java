package com.mtm.demo.ex.test;

import com.mtm.demo.ex.OverloadingDemo;

public class OverloadingDemoTest {

    public static void main(String[] args) {
        OverloadingDemo ob = new OverloadingDemo();
        double result;
        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test("Manju", 24);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }

}
