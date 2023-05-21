package com.mtm.examples.nestedclasses;

class A {

    A get() {
        return this;
    }
}

class B extends A {

    B get() {
        return this;
    }

    void message() {
        System.out.println("Welcome to covariant return type !!!");
    }

}

public class CovariantRetuenTypeDemo {

    public static void main(String[] args) {
        new B().get().message();
    }
}
