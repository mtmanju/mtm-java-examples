package com.mtm.examples.basic;

import java.util.Scanner;

/**
 * @author ManjunathMT
 */
public class FactorialExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    // n! = n * (n-1)!
    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }

}
