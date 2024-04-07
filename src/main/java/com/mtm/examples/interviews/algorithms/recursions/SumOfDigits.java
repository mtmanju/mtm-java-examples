package com.mtm.examples.interviews.algorithms.recursions;

public class SumOfDigits {

    public static void main(String[] args) {
        int num =2345;
        System.out.println(findRecSum(num));
    }

    private static int findRecSum(int num) {

        if(num/10==0)
            return num;
        else {

            return findRecSum(num/10) + num % 10;
        }
    }
}
