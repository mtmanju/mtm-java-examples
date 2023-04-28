package com.mtm.demo.inheritance;

import java.util.ArrayList;
import java.util.List;

class Animal1 {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog1 extends Animal1 {

	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class TestDog {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Animal1 a = new Animal1(); // Animal reference and object
		Animal1 b = new Dog1(); // Animal reference but Dog object

		a.move();// Runs the method in Animal class
		b.move();// Runs the method in Dog class

		Dog1 d = (Dog1) new Animal1(); // Will throw class cast exception
		d.move();

		List list = new ArrayList<>();
		list.add("String");

	}
}
