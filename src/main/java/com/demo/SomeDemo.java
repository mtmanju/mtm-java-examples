package com.demo;

public class SomeDemo {

    public <E extends Number> double addNumber(E e1, E e2) {
        return e1.doubleValue() + e2.doubleValue();
    }

    public static void main(String[] args) {
        InstanceOfDemo[][] theDogs =new InstanceOfDemo[3][];
        System.out.println(theDogs[2][0].toString());
}
}
