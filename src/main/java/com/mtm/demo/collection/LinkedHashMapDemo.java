package com.mtm.demo.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Insertion order
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1001, "Manju");
        map.put(1002, "Preeti");
        map.put(1003, "Nethra");
        map.put(1001, "Nethra");
        map.put(null, "Manju");
        map.put(null, "Preeti");

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
