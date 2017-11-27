package com.demo.ex.test;

import com.demo.ex.NestedClassDemo;
import com.demo.ex.NestedClassDemo.Inner;

public class NestedClassDemoTest {

    /**
     * @param args
     */
    public static void main(String args[]) {
        NestedClassDemo outer = new NestedClassDemo();
        outer.test();

        Inner inner = outer.new Inner();
        inner.display();
    }

}
