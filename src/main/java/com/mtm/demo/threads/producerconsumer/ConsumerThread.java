package com.mtm.demo.threads.producerconsumer;

public class ConsumerThread implements Runnable {

    Resource resource;

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                resource.get();
            } catch (InterruptedException ex) {
            }
        }
    }

    public ConsumerThread(Resource resource) {
        this.resource = resource;
        new Thread(this).start();
    }
}
