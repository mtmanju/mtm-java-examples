package com.mtm.examples.interviews.algorithms.recursions;

public class AdditiveSequence {

    public static void main(String[] args) {

        String num="abc";
        char[] numbers=num.toCharArray();
        int length=numbers.length;

        System.out.println(checkAddSeq(numbers,length));
    }

    private static String checkAddSeq(char[] numbers, int length) {

        for(int i=0;i<length;i++){

            System.out.println (String.valueOf(numbers[i])+ checkAddSeq(numbers,length-1));


        }

        return "";

    }


}
