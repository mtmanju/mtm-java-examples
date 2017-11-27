package com.mtm.demo.math;

import java.util.Scanner;

public class Swap2Numbers {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swap:\t" + "x=" + x + " y=" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:\t" + "x=" + x + " y=" + y);
    }
}
