package com.mtm.examples.interviews.algorithms.recursions;

public class PalindromeCheck {

    public static void main(String[] args) {
        int num=12321;

        checkRecPalindrome(num);
    }

    private static void checkRecPalindrome(int num) {

        if((num - reverseRec(num))==0)
            System.out.println("it is a palindrome Yayy!!!");
        else
            System.out.println("It is better not to be a palindrome");
    }

    private static int reverseRec(int num) {

        if(num/10==0)
            return num;
        else{
            return Integer.parseInt(num%10+""+reverseRec(num/10));
        }

    }
}
