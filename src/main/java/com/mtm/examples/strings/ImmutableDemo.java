package com.mtm.examples.strings;

public class ImmutableDemo {

    public static void main(String[] args) {
        String str = "Sachin";
        str = str.concat(" Tendulkar");
        System.out.println("o/p: " + str);
    }
}
