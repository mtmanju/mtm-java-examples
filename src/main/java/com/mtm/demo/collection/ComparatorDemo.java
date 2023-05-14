package com.mtm.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students {

    int rollno;
    String name;
    int age;

    Students(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        Students s1 = (Students) o1;
        Students s2 = (Students) o2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class RollNoComparator implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        Students s1 = (Students) o1;
        Students s2 = (Students) o2;

        if (s1.rollno == s2.rollno) {
            return 0;
        } else if (s1.rollno > s2.rollno) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameComparator implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        Students s1 = (Students) o1;
        Students s2 = (Students) o2;

        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Students> al = new ArrayList<Students>();
        al.add(new Students(101, "Vijay", 23));
        al.add(new Students(106, "Ajay", 27));
        al.add(new Students(105, "Jai", 21));

        System.out.println("Sorting by Name...");
        System.out.println("RollNo\t" + "Name\t" + "Age");
        System.out.println("*******************");
        Collections.sort(al, new NameComparator());
        Iterator<Students> itr = al.iterator();
        while (itr.hasNext()) {
            Students st = itr.next();
            System.out.println(st.rollno + "\t" + st.name + "\t" + st.age);
        }

        System.out.println();
        System.out.println("Sorting by Age...");
        System.out.println("RollNo\t" + "Name\t" + "Age");
        System.out.println("*******************");
        Collections.sort(al, new AgeComparator());
        Iterator<Students> itr2 = al.iterator();
        while (itr2.hasNext()) {
            Students st = itr2.next();
            System.out.println(st.rollno + "\t" + st.name + "\t" + st.age);
        }

        System.out.println();
        System.out.println("Sorting by RollNo...");
        System.out.println("RollNo\t" + "Name\t" + "Age");
        System.out.println("*******************");
        Collections.sort(al, new RollNoComparator());
        Iterator<Students> itr3 = al.iterator();
        while (itr3.hasNext()) {
            Students st = itr3.next();
            System.out.println(st.rollno + "\t" + st.name + "\t" + st.age);
        }
    }
}