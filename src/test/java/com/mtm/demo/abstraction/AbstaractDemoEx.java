package com.mtm.demo.abstraction;

import org.junit.Test;

public class AbstaractDemoEx extends AbstractDemo {

	public AbstaractDemoEx() {
		System.out.println("AbstaractDemoEx Constructor invoked");
	}

	public void run() {
		System.out.println("Running in sub class");
	}

	@Test
	public void testAbstarct() {
		AbstractDemo abcd = new AbstaractDemoEx();
		abcd.run();
	}

}
