package com.mtm.demo;

public class PalindromeDemo {

    public static void main(String[] args) {
        String originalStr = "MANJU";
        String reversedStr = "";
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + originalStr.charAt(i);
        }
        
        System.out.println("Original Str: " + originalStr);
        System.out.println("Reversed Str: " + reversedStr);

        if (originalStr.equals(reversedStr)) {
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }
}
