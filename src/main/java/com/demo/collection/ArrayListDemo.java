package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Manju");
        list.add("Preeti");
        list.add("Nethra");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // or
        System.out.println("********");
        for (String str : list) {
            System.out.println(str);
        }

        // or
        System.out.println("********");
        for (Object obj : list) {
            System.out.println(obj);
        }

    }

}
