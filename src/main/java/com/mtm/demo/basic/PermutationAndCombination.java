package com.mtm.demo.basic;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ManjunathMT
 *
 */
public class PermutationAndCombination {
	private static final Logger LOGGER = LoggerFactory.getLogger(PermutationAndCombination.class);

	public static void main(String[] args) {
		strPrnt("abc", null, 0);
	}

	private static void strPrnt(String inputStr, String fix, int fixedPost) {
		if (null == fix) {
			fix = StringUtils.EMPTY;
			LOGGER.info(inputStr);
		} else {
			if (inputStr.equals(fix)) {
				return;
			}
			LOGGER.info(fix);
		}

		for (int i = fixedPost; i < inputStr.length(); i++) {
			strPrnt(inputStr, fix + inputStr.charAt(i), i + 1);
		}

	}

}
