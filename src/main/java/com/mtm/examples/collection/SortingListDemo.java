package com.mtm.examples.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingListDemo {

    public static void main(String[] args) {

        // Example 1 (Sorting the elements of List that contains string objects)
        ArrayList<String> aList1 = new ArrayList<String>();
        aList1.add("Viru");
        aList1.add("Saurav");
        aList1.add("Mukesh");
        aList1.add("Tahir");
        aList1.add("Tahir");

        Collections.sort(aList1);
        Iterator<String> itr1 = aList1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        // Example 2 (Sorting the elements of List that contains Wrapper class objects)
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        al.add(230);// internally will be converted into objects as Integer.valueOf(230)

        Collections.sort(al);

        Iterator<Integer> itr2 = al.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
