package com.mtm.demo;

public class StringEncodeDemo {

    public static void main(String[] args) {
        String string = "aaaabbccdd";
        StringBuffer sb = new StringBuffer("");
        int count = 0;
        char str = string.charAt(count);
        for (int i = 0; i < string.length(); i++) {
            if (str == string.charAt(i)) {
                count++;
            } else {
                sb = sb.append(str);
                str = string.charAt(i);
                sb.append(count);
                count = 1;
            }
        }
        System.out.println(sb);

    }

}