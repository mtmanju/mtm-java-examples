package com.mtm.demo;

import java.util.HashMap;
import java.util.Map;

public class Coder {

    private String language;

    public Coder(String language) {
        this.language = language;
    }

    public boolean equals(Object obj) {

        Coder test = (Coder) obj;
        if (test.language.equals(language))
            return true;
        else
            return false;
    }

    public int hashCode() {
        return language.hashCode();
    }

    public static void main(String[] a) {
        Coder c1 = new Coder("Java");
        Coder c2 = new Coder("Python");
        Coder c3 = new Coder("Python");

        Map<Coder, String> myMap = new HashMap<Coder, String>();
        myMap.put(c1, c1.language);
        myMap.put(c3, c3.language);
        System.out.println("Map Size:" + myMap.size());
        System.out.println(myMap.get(c2));
    }

}