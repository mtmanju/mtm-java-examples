package com.mtm.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ManjunathMT
 *
 */
public class SortingArrayOfStringsExample {
	private static final Logger LOGGER = LoggerFactory.getLogger(PermutationAndCombination.class);

	public static void main(String[] input) {
		String[] names = { "Pratista", "Manju", "Nethra", "Preeti", "Smita" };
		String temp;

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
			LOGGER.info(names[i]);
		}
	}
}
