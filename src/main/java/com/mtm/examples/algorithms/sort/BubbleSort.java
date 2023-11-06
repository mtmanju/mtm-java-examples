package com.mtm.examples.algorithms.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {

        // Way 1
        Integer[] arrayOfNumbers_1 = {5, 1, 6, 2, 3, 4};
        bubbleSort_1(arrayOfNumbers_1, arrayOfNumbers_1.length);
        Arrays.stream(arrayOfNumbers_1).forEach(val -> {
            System.out.print(val + " ");
        });
        System.out.println();

        // Way 2
        Integer[] arrayOfNumbers_2 = {5, 1, 6, 2, 3, 4};
        bubbleSort_2(arrayOfNumbers_2, arrayOfNumbers_2.length);

        Arrays.stream(arrayOfNumbers_2).forEach(val -> {
            System.out.print(val + " ");
        });
        System.out.println();

        // Way 3
        Integer[] arrayOfNumbers_3 = {5, 1, 6, 2, 3, 4};
        optimizedBubbleSort(arrayOfNumbers_3, arrayOfNumbers_3.length);

        Arrays.stream(arrayOfNumbers_3).forEach(val -> {
            System.out.print(val + " ");
        });
    }

    private static void bubbleSort_1(Integer[] arrayOfNumbers, int arrayLength) {
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (arrayOfNumbers[j + 1] < arrayOfNumbers[j]) {
                    int swap = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = swap;
                }
            }
        }
    }

    static void bubbleSort_2(Integer[] arrayOfNumbers, int arrayLength) {
        IntStream.range(0, arrayLength - 1).flatMap(i -> IntStream.range(1, arrayLength - i)).forEach(j -> {
            if (arrayOfNumbers[j - 1] > arrayOfNumbers[j]) {
                int temp = arrayOfNumbers[j];
                arrayOfNumbers[j] = arrayOfNumbers[j - 1];
                arrayOfNumbers[j - 1] = temp;
            }
        });
    }

    static void optimizedBubbleSort(Integer[] arrayOfNumbers, int arrayLength) {
        int i = 0;
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
