package com.mtm.examples.algorithms.sort;

public class QuickSort {

    public static void main(String[] args) {
        // Way 1
        int[] arrayOfNumbers = {5, 1, 6, 2, 3, 4};
        quickSort(arrayOfNumbers, 0, arrayOfNumbers.length - 1);
        for (Integer number : arrayOfNumbers) {
            System.out.println(number);
        }
        System.out.println();

        // Way 2
        int[] numbersArray = {13, 16, 12, 11, 15, 14};
        threeWayQuickSort(numbersArray, 0, numbersArray.length - 1);
        for (Integer number : numbersArray) {
            System.out.println(number);
        }
    }

    public static void quickSort(int[] arrayOfNumbers, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arrayOfNumbers, begin, end);

            // Recursively sort elements of the 2 sub-arrays
            quickSort(arrayOfNumbers, begin, partitionIndex - 1);
            quickSort(arrayOfNumbers, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arrayOfNumbers, int begin, int end) {
        int pivot = arrayOfNumbers[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arrayOfNumbers[j] <= pivot) {
                i++;

                int swapTemp = arrayOfNumbers[i];
                arrayOfNumbers[i] = arrayOfNumbers[j];
                arrayOfNumbers[j] = swapTemp;
            }
        }

        int swapTemp = arrayOfNumbers[i + 1];
        arrayOfNumbers[i + 1] = arrayOfNumbers[end];
        arrayOfNumbers[end] = swapTemp;

        return i + 1;
    }

    public static void threeWayQuickSort(int[] a, int begin, int end) {
        if (end <= begin)
            return;

        // partition
        int i = begin;
        int less = begin;
        int greater = end;

        while (i <= greater) {
            if (a[i] < a[less]) {
                int tmp = a[i];
                a[i] = a[less];
                a[less] = tmp;

                i++;
                less++;
            } else if (a[less] < a[i]) {
                int tmp = a[i];
                a[i] = a[greater];
                a[greater] = tmp;

                greater--;
            } else {
                i++;
            }
        }

        threeWayQuickSort(a, begin, less - 1);
        threeWayQuickSort(a, greater + 1, end);
    }

}