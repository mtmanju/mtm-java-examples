package com.mtm.examples.interviews.datastructure.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node addNodeAtTheBeggining(Integer data){
        Node newNode=new Node(data);

        if(head==null)
            head=newNode;
        else{
            newNode.setNext(head);
            head=newNode;
        }

        return head;
    }

    public Node addAtTheEnd(Integer data){
        Node newNode=new Node(data);
        Node tempNode=head;

        if(head==null)
            head=newNode;
        else{
            while (tempNode.getNext()!=null){

                tempNode=tempNode.getNext();
            }
            tempNode.setNext(newNode);


        }

        return head;
    }

    public Node deleteFromEnd(){

        Node tempNode=head;

        while(tempNode.getNext().getNext()!=null) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);

        return head;

    }

    public Node deleteFromBeginning(){
        Node tempNode=head;

        head=head.getNext();

        return head;
    }

    public Node deleteFromIndex(int n){
        Node tempNode=head;

        for(int i=1;i<n;i++){
            tempNode=tempNode.getNext();
        }

        tempNode.setNext(tempNode.getNext().getNext());

        return head;
    }

    static Node reverse(Node head){
        Node curr=head;

        Node prev = null;
        Node next = null;

        while(curr!=null){
            next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;

        }

        return prev;
    }
    public static void main(String[] args) throws IOException {

        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        Node n6=new Node(60);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(null);
       /* LinkedList linkedList=new LinkedList(n1);
        linkedList.addAtTheEnd(20);
        linkedList.addAtTheEnd(30);
        linkedList.addAtTheEnd(40);
        linkedList.addAtTheEnd(50);
        linkedList.addNodeAtTheBeggining(60);
        linkedList.addAtTheEnd(70);
        linkedList.addAtTheEnd(80);
       // linkedList.deleteFromEnd();
        //linkedList.deleteFromBeginning();
    linkedList.deleteFromIndex(4);*/

       ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
       reverseLinkedList.reverse(n1);


    }
}
