package com.mtm.demo;

import java.lang.reflect.Method;

class ReflectionDemo {

    public static void main(String args[]) {
        try {
            @SuppressWarnings("rawtypes")
            Class c = Class.forName("/Demos/bin/com/demo/Cat.class");
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
