package com.mtm.examples.interviews.datastructure.graphs.hackerearth;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumAbsoluteDifference function below.
    static String gridChallenge(String[] grid) {

        int length=grid.length;
        char[][]arr=new char[length][length];
        for(int i=0;i<length;i++){
            String row=grid[i];
            for(int j=0;j<length;j++) {
                char[] charRows = row.toCharArray();
                Arrays.sort(charRows);
                arr[i][j] = charRows[j];
            }

        }

        for(;;)

        return null;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length=Integer.parseInt(br.readLine());
        String arr[]=br.readLine().split(" ");
        String actualArr[]=new String [length];

        for (int i=0;i<length;i++){
            actualArr[i]=arr[i];
        }

        System.out.println(gridChallenge(actualArr));
    }
}
