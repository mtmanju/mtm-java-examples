package com.mtm.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = "Hello MT Manju";

		int index = 0;
		Map<String, Integer> map1 = new HashMap<>();

		StringTokenizer st1 = new StringTokenizer(str1, " ");
		while (st1.hasMoreTokens()) {
			map1.put(st1.nextToken(), index);
			index++;
		}
		System.out.println("Map: " + map1);

	}
}
