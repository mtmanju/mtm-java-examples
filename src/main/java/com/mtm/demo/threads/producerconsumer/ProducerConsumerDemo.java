package com.mtm.demo.threads.producerconsumer;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Resource resource = new Resource();
        new ProducerThread(resource);
        new ConsumerThread(resource);
    }
}
