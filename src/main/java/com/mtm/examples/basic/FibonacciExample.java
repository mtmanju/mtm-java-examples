package com.mtm.examples.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ManjunathMT
 */
public class FibonacciExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Case 1:
        System.out.println("Fibonacci series upto " + n + " is " + fibonacciSeries(n));

        // Case 2:
        System.out.println(n + "th fibonacci number is " + fibonacci(n));

        // Case 3:
        System.out.println(checkForFibonacci(n) ? n + " is a fibonacci number" : n + " is not a fibonacci number");
    }

    // Case 1:
    public static List<Integer> fibonacciSeries(int n) {
        int a = 0, b = 1;

        List<Integer> intArray = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            intArray.add(a);
            a = a + b;
            b = a - b;
        }
        return intArray;
    }

    // Case 2:
    // Time complexity : T(n) = T(n-1) + T(n-2)
    public static int fibonacci(int n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Case 3:
    // A number is fibonacci if and only if one or both of (5*n^2 + 4) or
    // (5*n^2 - 4) is a perfect square
    public static boolean checkForFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static boolean isPerfectSquare(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }

}
