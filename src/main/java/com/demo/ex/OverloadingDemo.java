package com.demo.ex;

public class OverloadingDemo {

    // Demonstrate method overloading.
    public void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter.
    public void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.
    public void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for string and integer parameters.
    public void test(String a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // overload test for a double parameter
    public double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
