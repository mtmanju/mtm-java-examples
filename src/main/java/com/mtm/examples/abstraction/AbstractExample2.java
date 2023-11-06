package com.mtm.examples.abstraction;

interface A {
    void a();

    void b();

    void c();

    void d();
}


abstract class B implements A {
    public void c() {
        System.out.println("I am c");
    }
}

class C extends B {

    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }

}

public class AbstractExample2 {

    public static void main(String[] args) {
        A a = new C();
        a.a();
        a.b();
        a.c();
        a.d();
    }

}