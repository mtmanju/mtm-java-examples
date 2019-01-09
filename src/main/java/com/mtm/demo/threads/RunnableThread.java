package com.mtm.demo.threads;

public class RunnableThread implements Runnable{

	RunnableThread(){
		System.out.println("In Constructor");
	}
	
	public void run(){
		System.out.println("In Run");
	}
}
