package com.demo.ex.test;

import com.demo.ex.Stack;

public class StackTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        // push some numbers onto the stack
        for (int i = 0; i < 10; i++)
            mystack1.push(i);
        for (int i = 10; i < 20; i++)
            mystack2.push(i);
        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.pop() + "\t");
        System.out.println("\nStack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(+mystack2.pop() + "\t");

    }

}
