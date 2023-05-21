package com.mtm.examples.algorithms.sort;

import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {

        // Way 1
        Integer[] arrayOfNumbers = {5, 1, 6, 2, 3, 4};
        bubbleSort(arrayOfNumbers);
        for (Integer number : arrayOfNumbers) {
            System.out.println(number);
        }
        System.out.println();

        // Way 2
        Integer[] numbersArray = {5, 1, 6, 2, 3, 4};
        optimizedBubbleSort(numbersArray);
        for (Integer number : numbersArray) {
            System.out.println(number);
        }
    }

    static void bubbleSort(Integer[] arrayOfNumbers) {
        int arrayLength = arrayOfNumbers.length;
        IntStream.range(0, arrayLength - 1).flatMap(i -> IntStream.range(1, arrayLength - i)).forEach(j -> {
            if (arrayOfNumbers[j - 1] > arrayOfNumbers[j]) {
                int temp = arrayOfNumbers[j];
                arrayOfNumbers[j] = arrayOfNumbers[j - 1];
                arrayOfNumbers[j - 1] = temp;
            }
        });
    }

    static void optimizedBubbleSort(Integer[] arrayOfNumbers) {
        int i = 0;
        int arrayLength = arrayOfNumbers.length;

        boolean swapNeeded = true;
        while ((i < arrayLength - 1) && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < arrayLength - i; j++) {
                if (arrayOfNumbers[j - 1] > arrayOfNumbers[j]) {
                    int temp = arrayOfNumbers[j - 1];
                    arrayOfNumbers[j - 1] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
    }
}
