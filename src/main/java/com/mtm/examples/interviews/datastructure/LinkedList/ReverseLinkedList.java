package com.mtm.examples.interviews.datastructure.LinkedList;

public class ReverseLinkedList {


    public Node reverse(Node head){

        if(head!=null) {
            Node next = head.next;
            head.next = null;
            next.setNext(head);
            reverse(next);
            head=head.next;
        }
        return head;

    }
}
