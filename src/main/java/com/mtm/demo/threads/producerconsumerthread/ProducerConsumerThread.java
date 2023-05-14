package com.mtm.demo.threads.producerconsumerthread;

public class ProducerConsumerThread {

    SharedResource sharedResource = new SharedResource();

    public static void main(String[] args) {
        ProducerConsumerThread pcThread = new ProducerConsumerThread();
        Thread oddNumThread = new Thread(pcThread.new OddNumber(), "ODD");
        oddNumThread.start();

        Thread evenNumThread = new Thread(pcThread.new EvenNumber(), "EVEN");
        evenNumThread.start();
    }

    class OddNumber implements Runnable {

        public void run() {
            for (int i = 1; i <= 10; i = i + 2) {
                sharedResource.oddNumber(i);
            }
        }
    }

    class EvenNumber implements Runnable {

        public void run() {
            for (int i = 2; i <= 10; i = i + 2) {
                sharedResource.evenNumber(i);
            }
        }
    }

}

class SharedResource {
    public static boolean oddFlag = false;

    public synchronized void oddNumber(int number) {
        if (oddFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        oddFlag = true;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        notifyAll();
    }

    public synchronized void evenNumber(int number) {
        if (!oddFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        oddFlag = false;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        notifyAll();
    }

}
