package com.mtm.examples.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ManjunathMT
 */
@Slf4j
public class SortingArrayOfStringsExample {

    public static void main(String[] input) {
        String[] names = {"Pratista", "Manju", "Nethra", "Preeti", "Smita"};
        String temp;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
            log.info(names[i]);
        }
    }
}
