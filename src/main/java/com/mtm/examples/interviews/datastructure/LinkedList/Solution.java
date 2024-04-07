package com.mtm.examples.interviews.datastructure.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
 }
public class Solution {

    public boolean isPalindrome(ListNode head) {

        ListNode temp= head;
        ListNode temp2=head;

        Stack<Integer> stack=new Stack();

        while(temp2!=null&&temp2.next!=null){
            stack.push(temp.val);
            temp=temp.next;
            temp2=temp2.next.next;

        }
        temp=temp.next;
        while(temp!=null){
            if(stack.peek()==temp.val){
                temp=temp.next;
                stack.pop();
            }
        }

        if(stack.isEmpty())return true ;
        else return false;
    }


    public static void main(String[] args) {
        Solution solution=new Solution();

        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(1);
        l1.next=l2;
        l2.next=l3;

        ListNode l4=new ListNode(1);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(4);
        l4.next=l5;
        l5.next=l6;

        System.out.println(solution.isPalindrome(l1));
    }
    }
