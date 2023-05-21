package com.mtm.examples.basic;

import java.util.Scanner;

/**
 * @author ManjunathMT
 */
public class PalindromeExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string for checking: ");
        String originalStr = scanner.nextLine();
        scanner.close();

        // Case 1: Using Recursion
        printResult(isPalindromeUsingRecursion(originalStr), originalStr);

        // Case 2: Using for loop
        printResult(isPalindromeUsingForLoop(originalStr), originalStr);
    }

    public static boolean isPalindromeUsingRecursion(String originalStr) {
        // if length is 0 or 1 then String is palindrome
        if (originalStr.length() == 0 || originalStr.length() == 1) {
            return true;
        }
        if (originalStr.charAt(0) == originalStr.charAt(originalStr.length() - 1)) {
            /*
             * check for first and last char of String: if they are same then do the same
             * thing for a substring with first and last char removed. and carry on this
             * until you string completes or condition fails Function calling itself:
             * Recursion
             */
            return isPalindromeUsingRecursion(originalStr.substring(1, originalStr.length() - 1));
        }
        /*
         * If program control reaches to this statement it means the String is not
         * palindrome hence return false.
         */
        return false;
    }

    public static boolean isPalindromeUsingForLoop(String originalStr) {
        String reversedStr = "";
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + originalStr.charAt(i);
        }
        return originalStr.equals(reversedStr);
    }

    public static void printResult(boolean isPalindrome, String originalStr) {
        if (isPalindrome) {
            System.out.println(originalStr + " is a palindrome");
        } else {
            System.out.println(originalStr + " is not a palindrome");
        }
    }

}
