package com.mtm.demo.math;

class ReverseNumber {

    public static void main(String args[]) {
        Integer n = 564;
        int reverse = 0;
System.out.println(n.shortValue());

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of number is " + reverse);
    }
}