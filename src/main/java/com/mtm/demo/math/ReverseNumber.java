package com.mtm.demo.math;

class ReverseNumber {

	public static void main(String[] args) {
		int input = 5642, copyInput = input;
		int reverse = 0;

		while (input != 0) {
			reverse = reverse * 10;
			reverse = reverse + input % 10;
			input = input / 10;
		}

		System.out.println("Reverse of number " + copyInput + " is " + reverse);
	}
}