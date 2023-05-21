package com.mtm.examples.strings;

public class ToStringDemo {

    int rollNo;
    String name;
    String city;

    public ToStringDemo(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {
        ToStringDemo tsd = new ToStringDemo(176664, "Manjunath", "Chintamani");

        // un-comment toString() and test
        System.out.println(tsd);
        System.out.println(tsd);

    }

    public String toString() {
        return rollNo + " " + name + " " + city;
    }
}
