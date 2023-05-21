package com.mtm.examples;

import java.lang.reflect.Method;

class ReflectionDemo {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.mtm.examples.ReflectionDemo");
            Method[] methods = c.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i].toString());
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public long addNumber(int a, int b) {
        return a + b;
    }
}
