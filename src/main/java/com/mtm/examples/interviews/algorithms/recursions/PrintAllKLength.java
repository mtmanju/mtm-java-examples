package com.mtm.examples.interviews.algorithms.recursions;
/*Print all possible strings of length k that can be formed from a set of n characters
* Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.*/

public class PrintAllKLength {

	public static void main(String[] args) {
		char[] arr = new char[4];
		int k = 3;

		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';

		printPossibleCombo(arr, k, 4, "");
	}

	private static void printPossibleCombo(char[] arr, int k, int arrLen, String prefix) {
		if (k == 0) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i < arrLen; i++) {
			String newP = prefix + arr[i];
			System.out.println(newP);
			printPossibleCombo(arr, k - 1, arrLen, newP);
		}

	}

}
