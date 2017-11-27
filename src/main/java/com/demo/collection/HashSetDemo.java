package com.demo.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(4);
        set.add(4);
        set.add(6);
        set.add(2);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
