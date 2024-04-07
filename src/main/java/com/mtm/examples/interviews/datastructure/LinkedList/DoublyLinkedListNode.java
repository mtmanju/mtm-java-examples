package com.mtm.examples.interviews.datastructure.LinkedList;

public class DoublyLinkedListNode<T> {

    T data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public DoublyLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode prev) {
        this.prev = prev;
    }
}
