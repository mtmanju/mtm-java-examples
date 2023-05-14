package com.mtm.demo.datastructures.stack;

public class Stack {

    private Item top;

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.printStack();
        stack.push(05);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.printStack();
        stack.pop();
        stack.printStack();
    }

    public void push(int data) {
        if (null == top) {
            top = new Item(data);
        } else {
            Item item = new Item(data);
            item.next = top;
            top = item;
        }
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public void printStack() {
        Item temp = top;

        if (top == null) {
            System.out.println("Stack is empty!");
        }
        System.out.println();

        while (temp != null) {
            System.out.println(" >> " + temp.data);
            temp = temp.next;
        }
    }
}

class Item {
    int data;
    Item next;

    public Item(int data) {
        this.data = data;
    }
}