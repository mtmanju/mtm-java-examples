package com.mtm.demo.designpattern;

import com.mtm.demo.designpattern.AdapterDesignPattern.Adapter;

public class AdapterDesignDemo {
    public static void main(String[] args) {
        Adapter a = new AdapterDesignPattern().new Adapter();
        System.out.println("O/p : " + a.secretFormula(9.99f));
    }
}
