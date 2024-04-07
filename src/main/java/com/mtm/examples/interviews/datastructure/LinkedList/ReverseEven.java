package com.mtm.examples.interviews.datastructure.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseEven {

    public static void main(String[] args) throws Exception{
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfItems = Integer.parseInt(br.readLine());                // Reading input from STDIN

        String []listOfNumbers=br.readLine().split(" ");

        Integer []indexToBeReversed =new Integer[numOfItems];

        for(int i=0;i<numOfItems-1;i++){
            if (Integer.parseInt(listOfNumbers[i])%2==0 && Integer.parseInt(listOfNumbers[i+1])%2==0){
                 String temp=listOfNumbers[i+1];
                listOfNumbers[i+1]=listOfNumbers[i];
                listOfNumbers[i]=temp;

            }
        }
        for (int i=0;i<numOfItems;i++){

            System.out.print(listOfNumbers[i] + " ");
        }


    }
}
