package com.mtm.demo.threads;

public class RunnableThread implements Runnable {

	RunnableThread() {
		System.out.println("In Constructor");
	}

	public void run() {
		System.out.println("In Run");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableThread());
		t1.start();
	}
}