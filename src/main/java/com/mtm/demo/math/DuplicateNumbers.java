package com.mtm.demo.math;

public class DuplicateNumbers {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {4, 2, 4, 5, 2, 3, 1};
        int arrayLength = arrayOfNumbers.length;

        DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
        duplicateNumbers.printRepeating(arrayOfNumbers, arrayLength);
    }

    private void printRepeating(int[] arrayOfNumbers, int arrayLength) {
        int i, j;

        System.out.println("Repeated Elements are:");
        for (i = 0; i < arrayLength; i++) {
            for (j = i + 1; j < arrayLength; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j]) {
                    System.out.print(arrayOfNumbers[i] + " ");
                }
            }
        }
    }

}