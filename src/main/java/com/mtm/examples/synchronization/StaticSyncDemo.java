package com.mtm.examples.synchronization;

class Table3 {

    synchronized static void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThred5 extends Thread {

    public void run() {
        Table3.printTable(1);
    }
}

class MyThred6 extends Thread {

    public void run() {
        Table3.printTable(10);
    }
}

class MyThred7 extends Thread {

    public void run() {
        Table3.printTable(100);
    }
}

class MyThred8 extends Thread {

    public void run() {
        Table3.printTable(1000);
    }
}

public class StaticSyncDemo {

    public static void main(String[] args) {
        MyThred5 t5 = new MyThred5();
        MyThred6 t6 = new MyThred6();
        MyThred7 t7 = new MyThred7();
        MyThred8 t8 = new MyThred8();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}