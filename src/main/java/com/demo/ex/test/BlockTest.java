package com.demo.ex.test;

class BlockTest {

    public static void main(String args[]) {
        int x, y;
        y = 20;
        // the target of this loop is a block
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x + "This is y: " + y);
            y = y - 2;
        }
    }
}