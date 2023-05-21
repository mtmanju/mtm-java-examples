package com.mtm.examples.collection;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        new TreeSetDemo().go();

    }

    public void go() {
        Book b1 = new Book("Bow cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

    class Book implements Comparable<Book> {

        String title;

        public Book(String t) {
            title = t;
        }

        public int compareTo(Book arg0) {
            return this.title.compareTo(arg0.title);
        }

        public String toString() {
            return title;
        }

    }
}