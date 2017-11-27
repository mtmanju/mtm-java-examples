package com.demo.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String args[]) {

        // HashMap maintains no order.
        // HashMap can contain one null key and multiple null values.
        // HashMap is not synchronized.
        Map<Integer, String> map = new HashMap<Integer, String>();
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
