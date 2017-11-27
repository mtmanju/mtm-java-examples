package com.demo.designpattern;

import com.demo.designpattern.AdapterDesignPattern.Adapter;

public class AdapterDesignDemo {
	public static void main(String[] args) {
		Adapter a = new AdapterDesignPattern().new Adapter();
		System.out.println("O/p : " + a.secretFormula(9.99f));
	}
}
