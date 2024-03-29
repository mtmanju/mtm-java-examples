package com.mtm.examples.reflection;

import java.lang.reflect.Method;

class A {

    @SuppressWarnings("unused")
    private void message() {
        System.out.println("hello java");
    }
}

public class MethodCall {

    public static void main(String[] args) throws Exception {

        Class<A> c = A.class;
        Object o = c.newInstance();
        Method m = c.getDeclaredMethod("message");
        m.setAccessible(true);
        m.invoke(o);
    }
}
