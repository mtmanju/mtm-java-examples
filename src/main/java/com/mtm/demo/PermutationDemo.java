package com.mtm.demo;

// No input validation
public class PermutationDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        strPrnt("abc", null, 0);
    }

    private static void strPrnt(String str, String fix, int fixedPost) {
        if (fix == null) {
            System.out.println(str);
            fix = "";
        } else {
            if (str.equals(fix))
                return;
            System.out.println(fix);
        }

        for (int i = fixedPost; i < str.length(); i++) {
            strPrnt(str, fix + str.charAt(i), i + 1);

        }

    }

}
