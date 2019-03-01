package com.mtm.demo.algorithms.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// 1st Way
		Integer[] arrayOfNumbers = { 5, 1, 6, 2, 3, 4 };
		insertionSortImperative(arrayOfNumbers);
		System.out.println("Insertion Sort Imperative -->");
		for (Integer number : arrayOfNumbers) {
			System.out.println(number);
		}
		System.out.println("<-- Insertion Sort Imperative");
		System.out.println("");

		// 2nd Way
		Integer[] arrayOfNumbersForRecursive = { 7, 5, 1, 6, 2, 3, 4 };
		insertionSortRecursive(arrayOfNumbersForRecursive);
		System.out.println("Insertion Sort Recursive -->");
		for (Integer number : arrayOfNumbersForRecursive) {
			System.out.println(number);
		}
		System.out.println("<-- Insertion Sort Recursive");

	}

	public static void insertionSortImperative(Integer[] arrayOfNumbers) {
		for (int i = 1; i < arrayOfNumbers.length; i++) {
			int key = arrayOfNumbers[i];
			int j = i - 1;
			while (j >= 0 && arrayOfNumbers[j] > key) {
				arrayOfNumbers[j + 1] = arrayOfNumbers[j];
				j = j - 1;
			}
			arrayOfNumbers[j + 1] = key;
		}
	}

	public static void insertionSortRecursive(Integer[] arrayOfNumbers) {
		insertionSortRecursive(arrayOfNumbers, arrayOfNumbers.length);
	}

	private static void insertionSortRecursive(Integer[] arrayOfNumbers, int arrayLength) {
		// base case
		if (arrayLength <= 1) {
			return;
		}

		// sort the first i - 1 elements of the array
		insertionSortRecursive(arrayOfNumbers, arrayLength - 1);

		// then find the correct position of the element at position i
		int key = arrayOfNumbers[arrayLength - 1];
		int j = arrayLength - 2;
		// shifting the elements from their position by 1
		while (j >= 0 && arrayOfNumbers[j] > key) {
			arrayOfNumbers[j + 1] = arrayOfNumbers[j];
			j = j - 1;
		}
		// inserting the key at the appropriate position
		arrayOfNumbers[j + 1] = key;
	}
}
