package com.mtm.demo.threads.producerconsumer;

public class ProducerThread implements Runnable {

    Resource resource;

    public ProducerThread(Resource resource) {
        this.resource = resource;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                resource.put("DATA ADDED");
            } catch (InterruptedException e) {
            }
        }
    }
}
