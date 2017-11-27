package com.demo.ex;

import java.util.ArrayList;
import java.util.List;

public class DivideList {

    /**
     * @param args
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);

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

        resultList = subDivide(list, 4, resultList);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Time Diff:" + (end - start));
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static List subDivide(List list, int subCollectionSize, List resultList) {
        for (int i = 0; i < list.size() / subCollectionSize + 1; i++) {
            int maxLength;
            if (i * subCollectionSize + subCollectionSize > list.size())
                maxLength = list.size();
            else
                maxLength = i * subCollectionSize + subCollectionSize;
            List sublist = new ArrayList();
            for (int j = i * subCollectionSize; j < maxLength; j++) {

                sublist.add(list.get(j));
            }
            resultList.add(sublist);
        }
        return resultList;
    }

}
