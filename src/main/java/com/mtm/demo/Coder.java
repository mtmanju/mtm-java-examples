package com.mtm.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Coder {

	private final String language;

	public Coder(String language) {
		this.language = language;
	}

	public boolean equals(Object obj) {
		Coder coder = (Coder) obj;
		return coder.language.equals(language);
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
		myMap.put(c2, c2.language);
		myMap.put(c3, c3.language);
		System.out.println("Map Size: " + myMap.size());

		for (Entry<Coder, String> entry : myMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

}