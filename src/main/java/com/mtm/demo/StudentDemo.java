package com.mtm.demo;

public class StudentDemo {

    int id;
    String name;

    public StudentDemo() {
    }

    StudentDemo(int i, String n) {
        id = i;
        name = n;
    }

    StudentDemo(StudentDemo s) {
        id = s.id;
        name = s.name;
    }

    public void display() {
        System.out.println(id + " " + name);
        display2(this);
    }

    public void display2(StudentDemo demo) {
        System.out.println(id + " " + name);
    }

    public void display3() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
   //     StudentDemo s0 = new StudentDemo();
        StudentDemo s1 = new StudentDemo(111, "Manju");
   //     StudentDemo s2 = new StudentDemo(s1);
        s1.display();
        // s0.id = s1.id;
        // s0.name = s1.name;
        // s0.display();
    }
}
