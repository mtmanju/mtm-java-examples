package com.mtm.examples.threads;

public class PriorityDemo extends Thread {

    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo();
        PriorityDemo t2 = new PriorityDemo();
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();

    }

    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());

    }
}
