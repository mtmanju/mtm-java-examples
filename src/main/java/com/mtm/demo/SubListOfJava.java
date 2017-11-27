package com.mtm.demo;

import java.util.ArrayList;
import java.util.List;

public class SubListOfJava {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        arrayList.add("element_4");
        arrayList.add("element_5");
        arrayList.add("element_6");
        arrayList.add("element_7");
        arrayList.add("element_8");
        arrayList.add("element_9");
        arrayList.add("element_10");

        int lineItemSize = arrayList.size();

        List<String> subList = arrayList.subList(0, lineItemSize - 8);
        System.out.println("Elements in sub list1 : " + subList);

        System.out.println();

        List<String> subList2 = arrayList.subList(8, lineItemSize);
        System.out.println("Elements in sub list2 : " + subList2);
    }

}