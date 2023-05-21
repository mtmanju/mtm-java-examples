package com.mtm.examples.basic;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ManjunathMT
 */
@Slf4j
public class PermutationAndCombination {

    public static void main(String[] args) {
        strPrnt("abc", null, 0);
    }

    private static void strPrnt(String inputStr, String fix, int fixedPost) {
        if (null == fix) {
            fix = StringUtils.EMPTY;
            log.info(inputStr);
        } else {
            if (inputStr.equals(fix)) {
                return;
            }
            log.info(fix);
        }

        for (int i = fixedPost; i < inputStr.length(); i++) {
            strPrnt(inputStr, fix + inputStr.charAt(i), i + 1);
        }
    }

}