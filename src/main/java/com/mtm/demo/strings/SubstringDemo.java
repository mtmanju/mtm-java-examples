package com.mtm.demo.strings;

public class SubstringDemo {

    public static void main(String[] args) {
        String str = "Sachin Tendulkar";

        System.out.println(str.substring(6));
        System.out.println(str.substring(0, 6));

        System.out.println(str.startsWith("S"));
        System.out.println(str.startsWith("s"));

        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("R"));

    }

}
