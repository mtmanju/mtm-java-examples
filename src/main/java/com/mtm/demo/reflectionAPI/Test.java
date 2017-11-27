package com.mtm.demo.reflectionAPI;

class Simple {
}

class Test {

    public static void main(String args[]) throws InstantiationException, IllegalAccessException {

        Class<Simple> cl = Simple.class;
        System.out.println(cl.getName());
        System.out.println(cl.isInterface());
        System.out.println(cl.isArray());
        System.out.println(cl.isPrimitive());

        Simple s = (Simple) cl.newInstance();
        System.out.println(s);

    }
}