package com.mtm.examples.threads;

class Big extends Thread {
    public Big(Runnable r) {
        super(r);
    }

    public void run() {
        System.out.println("Big");
    }
}

class Small extends Thread {
    public void run() {
        System.out.println("Small");
    }
}

public class BigThread {
    public static void main(String[] args) {
        Big t1 = new Big(new Small());
        t1.start();

        Big t2 = new Big(t1);
        t2.start();

    }

}