package com.mtm.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(1);
		list.add(1000);
		list.add(10);
		list.add(10000);
		list.add(10);

		NavigableSet<Integer> ns = new TreeSet<Integer>(list);
		System.out.println(ns.tailSet(10, false));
		System.out.println(ns.tailSet(10));
		System.out.println(ns.higher(10));

		int a = ns.pollFirst();
		System.out.println("Size: " + ns.size());

		Collections.unmodifiableCollection(list);

	}
}
