package com.mtm.examples.runtimepolymorphism;

public class Splender extends Bike {

    public static void main(String[] args) {
        Bike b = new Splender();
        b.run();
    }

    void run() {
        System.out.println("Running safely with 60kmpl");
    }
}
