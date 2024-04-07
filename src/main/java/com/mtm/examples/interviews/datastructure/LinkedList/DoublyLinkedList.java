package com.mtm.examples.interviews.datastructure.LinkedList;

public class DoublyLinkedList {

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode temp = head;
        DoublyLinkedListNode x =null;


        while(temp!=null){
            x=temp.prev;
            temp.prev =temp.next;
            temp.next=x;
            temp=temp.prev;

        }
        if (x != null) {
            head = x.prev;
        }

        return head;


    }



    public static void main(String[] args) {
        DoublyLinkedListNode n1=new DoublyLinkedListNode(10);
        DoublyLinkedListNode n2=new DoublyLinkedListNode(20);
        DoublyLinkedListNode n3=new DoublyLinkedListNode(30);
        DoublyLinkedListNode n4=new DoublyLinkedListNode(40);
        DoublyLinkedListNode n5=new DoublyLinkedListNode(50);

        n1.setNext(n2);
        n1.setPrev(null);
        n2.setPrev(n1);
        n2.setNext(n3);
        n3.setPrev(n2);
        n3.setNext(n4);
        n4.setPrev(n3);
        n4.setNext(n5);
        n5.setPrev(n4);
        n5.setNext(null);

        reverse(n1);

    }
}
