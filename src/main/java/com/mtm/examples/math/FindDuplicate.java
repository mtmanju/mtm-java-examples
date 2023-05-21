package com.mtm.examples.math;

// Java code to find duplicates in O(n) time 
public class FindDuplicate {

    public static void main(String[] args) {
        FindDuplicate duplicate = new FindDuplicate();
        int[] arrayOfNumbers = {1, 2, 3, 1, 3, 6, 6};
        int arraySize = arrayOfNumbers.length;

        duplicate.printRepeating(arrayOfNumbers, arraySize);
    }

    // Function to print duplicates
    private void printRepeating(int[] arrayOfNumbers, int arraySize) {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < arraySize; i++) {
            if (arrayOfNumbers[Math.abs(arrayOfNumbers[i])] >= 0) {
                arrayOfNumbers[Math.abs(arrayOfNumbers[i])] = -arrayOfNumbers[Math.abs(arrayOfNumbers[i])];
            } else {
                System.out.print(Math.abs(arrayOfNumbers[i]) + " ");
            }
        }
    }

}