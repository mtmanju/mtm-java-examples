package com.mtm.examples.synchronization;

class Table2 {

    // with synchronized, what happens if synchronized removed pls chk.

    void printTable(int n) {
        synchronized (this) {
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
}

class MyThred3 extends Thread {

    Table t;

    MyThred3(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThred4 extends Thread {

    Table t;

    MyThred4(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class SyncBlockDemo {

    public static void main(String[] args) {
        Table obj = new Table();
        MyThred3 t3 = new MyThred3(obj);
        MyThred4 t4 = new MyThred4(obj);
        t3.start();
        t4.start();
    }
}