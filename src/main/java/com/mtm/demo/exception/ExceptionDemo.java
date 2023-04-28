package com.mtm.demo.exception;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide");
                int b = 35 / 0;
                System.out.println(b);
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                int[] a = new int[5];
                a[5] = 4;

            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("Other statement");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Nornmal flow");
    }
}
