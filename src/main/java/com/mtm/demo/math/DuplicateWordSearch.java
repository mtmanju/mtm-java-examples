package com.mtm.demo.math;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordSearch {
	public static void main(String[] args) {

		String sentance = "Hi manju how are you. How are you doing. How is your health. How is everything";
		String[] splittedWords = sentance.split(" ");

		Map<String, Integer> occurrences = new HashMap<String, Integer>();

		for (String word : splittedWords) {
			Integer oldCount = occurrences.get(word);
			if (oldCount == null) {
				oldCount = 0;
			}
			occurrences.put(word, oldCount + 1);
		}

		for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
			System.out.println("Word: " + entry.getKey() + "\tCount: " + entry.getValue());
		}
	}
}
