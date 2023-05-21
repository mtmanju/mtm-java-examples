package com.mtm.examples.threads;


class Job extends Thread {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Job job = new Job();
        job.start();
        synchronized (job) {
            job.wait();
        }

        System.out.println(job.counter);
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100000; i++)
                counter++;

            this.notifyAll();
        }
    }
}