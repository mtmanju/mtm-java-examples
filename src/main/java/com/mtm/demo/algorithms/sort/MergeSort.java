package com.mtm.demo.algorithms.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arrayOfNumbers = { 5, 1, 6, 2, 3, 4, 13, 16, 12, 11, 15, 14 };

		mergeSort(arrayOfNumbers, arrayOfNumbers.length);

		for (Integer number : arrayOfNumbers) {
			System.out.println(number);
		}

	}

	public static void mergeSort(int[] arrayOfNumbers, int arrayLength) {
		if (arrayLength < 2) {
			return;
		}

		int mid = arrayLength / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[arrayLength - mid];

        System.arraycopy(arrayOfNumbers, 0, leftArray, 0, mid);
        if (arrayLength - mid >= 0) System.arraycopy(arrayOfNumbers, mid, rightArray, mid - mid, arrayLength - mid);
		mergeSort(leftArray, mid);
		mergeSort(rightArray, arrayLength - mid);

		merge(arrayOfNumbers, leftArray, rightArray, mid, arrayLength - mid);
	}

	public static void merge(int[] arrayOfNumbers, int[] leftArray, int[] rightArray, int left, int right) {

		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {
			if (leftArray[i] <= rightArray[j]) {
				arrayOfNumbers[k++] = leftArray[i++];
			} else {
				arrayOfNumbers[k++] = rightArray[j++];
			}

		}

		while (i < left) {
			arrayOfNumbers[k++] = leftArray[i++];
		}

		while (j < right) {
			arrayOfNumbers[k++] = rightArray[j++];
		}
	}
}
