package com.mtm.examples.basic;

import java.util.Scanner;

public class CalculatePowerOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = scanner.nextInt();
        scanner.close();

        // Case 1: Calculate power of a number using recursion
        System.out.println("Result: " + powerUsingRecursion(base, exponent));

        // Case 3: Calculate power of a number using a while
        System.out.println("Result: " + powerUsingWhileLoop(base, exponent));

        // Case 2: Calculate power of a number using a for loop
        System.out.println("Result: " + powerUsingForLoop(base, exponent));
    }

    // Case 1
    public static long powerUsingRecursion(int base, int exponent) {
        if (exponent != 0) {
            return (base * powerUsingRecursion(base, exponent - 1));
        } else {
            return 1;
        }
    }

    // Case 2
    public static long powerUsingWhileLoop(int base, int exponent) {
        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        return result;
    }

    // Case 3
    public static long powerUsingForLoop(int base, int exponent) {
        long result = 1;

        for (; exponent != 0; --exponent) {
            result *= base;
        }
        return result;
    }

}