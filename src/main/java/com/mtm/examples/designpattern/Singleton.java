package com.mtm.examples.designpattern;

public final class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
