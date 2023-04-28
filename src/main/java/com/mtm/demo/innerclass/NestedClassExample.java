package com.mtm.demo.innerclass;

public class NestedClassExample {

	int outer_x = 100;

	public void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// this is an inner class
	public class Inner {

		public void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}

	public static void main(String[] args) {
		NestedClassExample outer = new NestedClassExample();
		outer.test();

		Inner inner = outer.new Inner();
		inner.display();
	}

}
