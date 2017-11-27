package com.demo;

public class EqualsandEqualsOperator {

    public static void main(String[] args) {
        String str1 = "Manjunath";
        String str2 = "Manjunath";
        String newString1 = new String("Manjunath");
        String newString2 = new String("Manjunath");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(newString1));
        System.out.println(newString1.equals(newString2));

        System.out.println(str1 == str2);
        System.out.println(str1 == newString1);
        System.out.println(newString1 == newString2);
    }
}
