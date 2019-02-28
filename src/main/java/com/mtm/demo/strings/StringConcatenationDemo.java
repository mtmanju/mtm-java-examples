package com.mtm.demo.strings;

public class StringConcatenationDemo {

    public static void main(String[] args) {
        String s1 = "Sachin";
        System.out.println(s1);

        s1 = "Sachin" + " Tendulkar";
        System.out.println(s1);

        String s2 = 10 + 20 + "Sachin" + 30 + 40;
        System.out.println(s2);

        String s3 = "Sachin ";
        String s4 = "Tendulkar";
        String s5 = s3.concat(s4);
        System.out.println(s5);

        String s6 = new String("Manju");
        s6.concat("M T");
        System.out.println(s6);

    }
}
