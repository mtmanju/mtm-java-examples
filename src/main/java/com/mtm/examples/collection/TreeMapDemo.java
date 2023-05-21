package com.mtm.examples.collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // TreeMap maintains ascending order.
        // TreeMap can'nt contain any null key.
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1004, "Manju");
        map.put(1001, "Manju");
        map.put(1003, "Preeti");
        map.put(1002, "Nethra");
        map.put(1001, "Nethra");

        // throws null pointer exception if we put null keys into the map
        // map.put(null, "Manju");

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
