package com.mtm.examples.interviews.algorithms.recursions;

public class AtoiRec {

    public static void main(String[] args) {

        String abc="1234";
        char[] digits=abc.toCharArray();
        int length=digits.length-1;


        System.out.println(atoiRec(digits,length));

    }

    private  static int atoiRec(char[] digits, int length) {


        if(length==0){
            return Character.getNumericValue(digits[length]);
        }
       return atoiRec(digits,length-1) * 10 + Character.getNumericValue(digits[length]);
    }
}
