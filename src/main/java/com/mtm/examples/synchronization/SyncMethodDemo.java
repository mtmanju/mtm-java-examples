package com.mtm.examples.synchronization;

class Table {

    // with synchronized, what happens if synchronized removed pls chk.

    synchronized void printTable(int n) {
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

class MyThred1 extends Thread {

    Table t;

    MyThred1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThred2 extends Thread {

    Table t;

    MyThred2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class SyncMethodDemo {

    public static void main(String[] args) {
        Table obj = new Table();
        MyThred1 t1 = new MyThred1(obj);
        MyThred2 t2 = new MyThred2(obj);
        t1.start();
        t2.start();
    }
}