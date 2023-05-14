package com.mtm.demo.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Manju");
        queue.add("Rahul");

        System.out.println("Element: " + queue.element() + " and Peek: " + queue.peek());

        System.out.print("\nIterating the queue elements:\t");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() +"\t");
        }

        queue.remove();
        queue.poll();

        System.out.print("\nAfter removing two elements:\t");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() +"\t");
        }

    }
}