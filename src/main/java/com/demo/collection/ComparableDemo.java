package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableDemo implements Comparable<Object> {

    int rollno;
    String name;
    int age;

    ComparableDemo(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    // is used to compare the current object with the specified object. 
    // For instance it may be either rollno,name,age or anything else. 
    public int compareTo(Object obj) {
        ComparableDemo cd = (ComparableDemo) obj;
        if (age == cd.age)
            return 0;
        else if (age > cd.age)
            return 1;
        else
            return -1;
    }

    public static void main(String args[]) {

        ArrayList<ComparableDemo> al = new ArrayList<ComparableDemo>();
        al.add(new ComparableDemo(101, "Vijay", 23));
        al.add(new ComparableDemo(106, "Ajay", 27));
        al.add(new ComparableDemo(105, "Jai", 21));

        Collections.sort(al);
        Iterator<ComparableDemo> itr = al.iterator();
        while (itr.hasNext()) {
            ComparableDemo cd = (ComparableDemo) itr.next();
            System.out.println(cd.rollno + "\t" + cd.name + "\t" + cd.age);
        }
    }

}
