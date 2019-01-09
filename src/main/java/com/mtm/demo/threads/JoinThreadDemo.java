package com.mtm.demo.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinThreadDemo {

    public static void main(String args[]) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " is Started");

        Thread exampleThread = new Thread() {

            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " is Started");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " is Completed");
                } catch (InterruptedException ex) {
                    Logger.getLogger(JoinThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        exampleThread.start();
        exampleThread.join();

        System.out.println(Thread.currentThread().getName() + " is Completed");
    }

}
