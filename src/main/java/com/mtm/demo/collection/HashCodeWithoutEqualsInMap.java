package com.mtm.demo.collection;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodeWithoutEqualsInMap {

	public static void main(String[] args) {
		Person p1 = new Person(1, "ABC");
		Person p2 = new Person(1, "ABC");
		Person p3 = new Person(1, "ABC");

		Map<Person, String> map = new HashMap<>();
		map.put(p1, "X");
		map.put(p2, "Y");
		map.put(p3, "Z");

		for (Entry<Person, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

	}

}

@AllArgsConstructor
class Person {
	int id;
	String name;

	@Override
	public int hashCode() {
		return id;
	}
// Un comment below code and see
//		public boolean equals(Object obj) {
//			Person coder = (Person) obj;
//			if (coder.name.equals(name)) {
//				return true;
//			} else {
//				return false;
//			}
//		}

}