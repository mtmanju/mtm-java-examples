package com.demo.ex;

import java.util.ArrayList;
import java.util.List;

public class CollectionSplitter {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    static List split(List srcList, int index) {
        List d = new ArrayList();
        for (int i = 0; i < srcList.size(); i = i + 4) {
            if ((i + 4) <= srcList.size()) {
                d.add(srcList.subList(i, i + 4));
            } else {
                d.add(srcList.subList(i, srcList.size()));
            }
        }
        return d;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List resultList = new ArrayList();
        List list = new ArrayList();
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

        System.out.println(start);
        resultList = split(list, 4);
        System.out.println(resultList);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Time Diff:" + (end - start));
    }
}
