package com.mtm.examples.interviews.datastructure.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedString {

    public String findBalancedString(String testString){

        Queue stringQueue=new LinkedList();
        if(checkBalance(testString))
            return testString;

        return null;


    }

    private boolean checkBalance(String testString) {

        int cnt=0;
        char []ch=testString.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(')
                cnt++;
            else if(ch[i]==')')
                cnt--;
        }

        if (cnt==0) return true;
        return false;
    }
}
