package com.mtm.demo.threads.producerconsumer;

public class Resource {

    private Boolean isProduced = false;
    private String data = "EMPTY";

    /**
     * Put method : puts only if is not already produced
     **/
    public synchronized void put(String data) throws InterruptedException {
        if (isProduced) {
            wait(); // Not Consumed Yet,Wait for consumer's signal.
        } else {
            this.data = data;
            isProduced = true;
            notify(); // Tell the Consumer that i'm done producing.
            System.out.println("Producer >> Data:" + this.data);
        }
    }

    /**
     * Get method : gets only if it has been produced
     **/
    public synchronized String get() throws InterruptedException {
        if (!isProduced) {
            wait(); // Not produced yet,wait for producer's signal.
        } else {
            String data = this.data;
            this.data = "MANJU";

            isProduced = false;
            notify(); // Tell the Producer that i'm done consuming.
            System.out.println("Consumer >> Data:" + this.data);
            return data;
        }
        return data;

    }
}
