package com.mtm.demo.datastructures.queue;

public class Queue {
    private Item front;
    private Item rear;

    public static void main(String[] args) {
        Queue q = new Queue();
        q.printQueue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.printQueue();
        q.dequeue();
        q.dequeue();
        q.printQueue();
    }

    public void enqueue(int data) {
        if (rear == null) {
            front = rear = new Item(data);
        } else {
            Item item = new Item(data);
            front.next = item;
            front = item;
        }
    }

    public int dequeue() {
        int data = rear.data;
        rear = rear.next;
        return data;
    }

    public void printQueue() {
        if (rear == null) {
            System.out.println("Stack is empty!");
        }

        Item temp = rear;
        System.out.println("REAR");

        while (temp != null) {
            System.out.println("<" + temp.data);
            temp = temp.next;
        }

        System.out.println("<FRONT");
    }
}

class Item {
    int data;
    Item next;

    public Item(int data) {
        this.data = data;
    }
}