package com.mtm.demo.recursion;

public class RecursionFibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + "\t");
        }
    }

    public static int fibonacci(int n) {
        // base case: if n is 0 or 1, return n
        if (n == 0 || n == 1) {
            return n;
        }
        // recursive case: return the sum of the previous two numbers in the series
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
