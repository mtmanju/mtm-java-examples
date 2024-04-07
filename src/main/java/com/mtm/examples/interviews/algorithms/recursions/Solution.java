package com.mtm.examples.interviews.algorithms.recursions;

public class Solution{

    public static void main(String[] args) {
        printKSizeStr(new String[]{"a","b","c"}, 3,3,"");
    }

        private static void printKSizeStr(String []abc, int k,int arrLen,String partStr) {

       if(k==0){
            System.out.println(partStr);
            return;
        }
        for(int i=0;i<arrLen;i++) {

            String pre = partStr + abc[i];
            printKSizeStr(abc, k - 1, arrLen, pre);

        }


        }
}
