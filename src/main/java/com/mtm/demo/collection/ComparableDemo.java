package com.mtm.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableDemo implements Comparable<ComparableDemo> {

    int rollno;
    String name;
    int age;

    ComparableDemo(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ArrayList<ComparableDemo> list = new ArrayList<ComparableDemo>();
        list.add(new ComparableDemo(101, "Vijay", 23));
        list.add(new ComparableDemo(106, "Ajay", 27));
        list.add(new ComparableDemo(105, "Jai", 21));

        Collections.sort(list);
        Iterator<ComparableDemo> itr = list.iterator();
        while (itr.hasNext()) {
            ComparableDemo cd = itr.next();
            System.out.println(cd.rollno + "\t" + cd.name + "\t" + cd.age);
        }
    }

    // is used to compare the current object with the specified object.
    // For instance it may be either rollno,name,age or anything else.
    public int compareTo(ComparableDemo obj) {
        if (age == obj.age) {
            return 0;
        } else if (age > obj.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
