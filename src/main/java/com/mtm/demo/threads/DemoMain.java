package com.mtm.demo.threads;

public class DemoMain {

	public static void main(String [] args){
		System.out.println("In Main");
		RunnableThread rt=new RunnableThread();
		Thread t=new Thread(rt);
		t.start();
		System.out.println("Thread Completed once");
		t.start();
		System.out.println("Thread Completed twice");
	}
}
