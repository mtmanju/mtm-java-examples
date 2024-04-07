package com.mtm.examples.interviews.algorithms.recursions;

import java.util.Stack;

public class StackSort {

  /*  public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int numOfElements=Integer.parseInt(br.readLine());
        Stack<Integer> inputStack=new Stack();
        for(int i=0;i<numOfElements;i++){
            inputStack.push(Integer.parseInt(br.readLine()));
        }
        sortUsingRec(inputStack);
    }*/

    private static void sortUsingRec(Stack<Integer> inputStack) {

        if(inputStack.isEmpty())
            return;//base case
        int top = inputStack.pop();
        sortUsingRec(inputStack);
        sortedStack(inputStack,top);




    }

    private static void sortedStack(Stack<Integer> stackToSort, int key) {

        if(stackToSort.isEmpty()||stackToSort.peek()<key) {
            stackToSort.push(key);//base case
            return;
        }
        int top=stackToSort.pop();
        sortedStack(stackToSort,key);
        stackToSort.push(top);


    }

    public static void main(String[] args) {
        Stack<Integer>stack =new Stack<Integer>();
        stack.push(-1);
        stack.push(12);
        stack.push(-3);
        stack.push(6);
        stack.push(9);
        System.out.println(stack);

        sortUsingRec(stack);
        System.out.println(stack);
    }
}
