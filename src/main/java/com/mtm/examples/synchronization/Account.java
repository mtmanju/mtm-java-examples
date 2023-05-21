package com.mtm.examples.synchronization;

public class Account {

    int balance;

    public synchronized void creditAccount(int amount) {
        balance += amount;
        notify();
        System.out.println("Credited" + balance);
    }

    public synchronized void debitAccount(int amount) throws InterruptedException {
        while ((balance - amount) < 0) wait();
        balance -= amount;
        System.out.println("Debited" + balance);

    }
}
