package com.mtm.demo.recursion;

public class RecursionPowerOfNumber {

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int base, int exponent) {
        // base case: if the exponent is 0, return 1
        if (exponent == 0) {
            return 1;
        }
        // recursive case: calculate the power of the base raised to the exponent - 1
        return base * power(base, exponent - 1);
    }

}