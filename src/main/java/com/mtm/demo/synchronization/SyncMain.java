package com.mtm.demo.synchronization;

public class SyncMain {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Account ac = new Account();
        ac.creditAccount(20);
        ac.debitAccount(20);

    }

}
