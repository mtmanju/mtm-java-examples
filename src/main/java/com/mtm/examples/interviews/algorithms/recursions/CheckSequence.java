package com.mtm.examples.interviews.algorithms.recursions;

public class CheckSequence {

    public static void main(String[] args) {
        int[]arr=new int[5];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;

        checkSequenceUsingRec(arr);
    }

    private static void checkSequenceUsingRec(int[] arr) {
        int num=arr.length;

        System.out.println(chkRecSeq(arr,num));


    }

    private static boolean chkRecSeq(int[] arr, int num) {

        int i=num-1;
        if(i>=1){
            if(arr[i]==arr[i-1]+1)
                return chkRecSeq(arr,i);
            else
                return false;

        }
        return true;

    }
}
