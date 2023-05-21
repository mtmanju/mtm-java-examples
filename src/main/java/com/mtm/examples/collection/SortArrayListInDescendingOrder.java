package com.mtm.examples.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayListInDescendingOrder {

    public static void main(String[] args) {

        // create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        // Add elements to Arraylist
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        /*
         * To get comparator that imposes reverse order on a Collection use static Comparator
         * reverseOrder() method of Collections class
         */

        Comparator<String> comparator = Collections.reverseOrder();

        System.out.println("Before sorting ArrayList in descending order : " + arrayList);

        /*
         * To sort an ArrayList using comparator use, static void sort(List list, Comparator c)
         * method of Collections class.
         */

        Collections.sort(arrayList, comparator);
        System.out.println("After sorting ArrayList in descending order : " + arrayList);

        List<String> list = Collections.unmodifiableList(arrayList);

        list.add("Manju");
        System.out.println("arryList: " + list);

    }
}
