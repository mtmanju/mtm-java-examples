package com.mtm.demo.ex;

public class NestedClassDemo {

    int outer_x = 100;

    public void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    public class Inner {

        public void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

}
