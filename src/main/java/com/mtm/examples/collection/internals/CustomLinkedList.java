package com.mtm.examples.collection.internals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manjunath M T
 */
public class CustomLinkedList<E> {
    Node<E> root;

    public static void main(String[] args) {
        CustomLinkedList<Object> list = new CustomLinkedList<>();
        list.addData(1);
        list.addData(2);
        list.addData("3");
        list.addData("Hello");

        System.out.println("Items:\t" + list.getData());
    }

    public void addData(E key) {
        Node<E> newNode = new Node<>(key);
        if (null == root) {
            root = newNode;
        } else {
            Node<E> currentNode = root;
            while (null != currentNode.next) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public List<Node<E>> getData() {
        List<Node<E>> nodes = new ArrayList<>();
        while (null != root.next) {
            nodes.add(root);
            root = root.next;
        }
        nodes.add(root);
        return nodes;
    }
}

class Node<E> {
    E key;
    Node<E> next;

    public Node(E key) {
        this.key = key;
    }

    public String toString() {
        return String.valueOf(key);
    }

}
