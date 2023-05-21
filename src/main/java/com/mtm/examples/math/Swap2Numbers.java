package com.mtm.examples.math;

import java.util.Scanner;

public class Swap2Numbers {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter x and y");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Before Swap:\t" + "x=" + x + " y=" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:\t" + "x=" + x + " y=" + y);
    }
}
