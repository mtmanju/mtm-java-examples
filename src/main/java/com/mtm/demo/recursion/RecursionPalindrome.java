package com.mtm.demo.recursion;

public class RecursionPalindrome {

    public static void main(String[] args) {
        String str = "MANJUJNAM";
        String isPalindrome = isPalindrome(str) ? "a" : "not a";
        System.out.println("(" + str + ") is " + isPalindrome + " palindrome");
    }

    public static boolean isPalindrome(String str) {
        // base case: if the length of the string is 0 or 1, it is a palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // check if the first and last characters of the string are the same
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // if they are the same, check the substring between them
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        // if the first and last characters are not the same, the string is not a palindrome
        return false;
    }


}
