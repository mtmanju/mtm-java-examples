package com.mtm.examples.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableDemo {

    public static void main(String[] args) {

        // Hashtable can'nt contain any null key.
        // Hashtable is synchronized.
        Map<Integer, String> map = new Hashtable<Integer, String>();
        map.put(1001, "Manju");
        map.put(1002, "Preeti");
        map.put(1003, "Manju");
        map.put(1001, "Nethra");

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
