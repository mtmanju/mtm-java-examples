package com.mtm.demo.stringhandling;

public class StringCompareDemo {

    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";

        // equals()
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        // == operator
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        // compareTo
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        // comparing string and string buffer
        String str = "Manjunath";
        StringBuffer strBfr = new StringBuffer("Manjunath");

        // case 1
        if (str.contentEquals(strBfr)) {
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }

        // case 2
        if (str.equals(strBfr.toString())) {
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }

    }
}
