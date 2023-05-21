package com.mtm.examples.ex;

import java.util.ArrayList;
import java.util.List;

public class CollectionSplitter {

    static List<List<String>> split(List<String> list, int index) {
        List<List<String>> newList = new ArrayList<List<String>>();
        for (int i = 0; i < list.size(); i = i + index) {
            if ((i + index) <= list.size()) {
                newList.add(list.subList(i, i + index));
            } else {
                newList.add(list.subList(i, list.size()));
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<List<String>> resultList = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        System.out.println("Start Time: " + start);
        resultList = split(list, 4);
        System.out.println(resultList);
        long end = System.currentTimeMillis();
        System.out.println("End Time: " + end);
        System.out.println("Time Diff: " + (end - start) + " ms");
    }
}
