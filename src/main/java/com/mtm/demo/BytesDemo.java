package com.mtm.demo;

public class BytesDemo {

    private static final String value = "品検索品検索品検索品検索品検索品検索品検索検索";


    public static void main(String[] args) {

        String str = filterOptionValue(value, 64);
        System.out.println("Final String: " + str.length());
    }

    public static String filterOptionValue(String value, int maxBytes) {
        int b = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            // ranges from http://en.wikipedia.org/wiki/UTF-8
            int skip = 0;
            int more;
            if (c <= 0x007F) {
                more = 1;
            } else if (c <= 0x07FF) {
                more = 2;
            } else if (c <= 0xD7FF) {
                more = 3;
            } else if (c <= 0xDFFF) {
                // surrogate area, consume next char as well
                more = 4;
                skip = 1;
            } else {
                more = 3;
            }

            if (b + more > maxBytes) {
                return value.substring(0, i);
            }
            b += more;
            i += skip;
        }
        return value;
    }

}
