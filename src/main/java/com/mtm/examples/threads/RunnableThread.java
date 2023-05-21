package com.mtm.examples.threads;

public class RunnableThread implements Runnable {

    RunnableThread() {
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThread());
        t1.start();
    }

    public void run() {
        System.out.println("In Run");
    }
}