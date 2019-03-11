package com.mtm.demo.java8;

/**
 * @author Manjunath M T
 *
 */
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Calculator calculator = (int x) -> x - x + x;
		System.out.println(calculator.calculate(52));
	}
}

@FunctionalInterface
interface Calculator {
	int calculate(int x);

}