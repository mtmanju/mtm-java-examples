package com.mtm.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ManjunathMT
 *
 */
public class PalindromeExample {
	private static final Logger LOGGER = LoggerFactory.getLogger(PermutationAndCombination.class);

	public static void main(String[] args) {
		String originalStr = "MANJUNATH";
		String reversedStr = "";
		for (int i = originalStr.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + originalStr.charAt(i);
		}

		LOGGER.info("Original Str: " + originalStr);
		LOGGER.info("Reversed Str: " + reversedStr);

		if (originalStr.equals(reversedStr)) {
			LOGGER.info("Given string is a palindrome");
		} else {
			LOGGER.info("Given string is not a palindrome");
		}
	}
}
