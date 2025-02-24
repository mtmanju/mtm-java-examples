package com.mtm.examples.manju;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Easy_TwoSumUsingArrayList {

	public static void main(String[] args) {
		int sum = 8;
		List<Integer> numbersArray = Arrays.asList(1, 5, 6, 8, 3);

		List<Integer> result = twoSum(numbersArray, sum);
		if (result != null) {
			System.out.println("Indices of the two numbers: " + result);
		} else {
			System.out.println("No two numbers found with the sum " + sum);
		}

	}

	private static List<Integer> twoSum(List<Integer> numbersArray, int sum) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i <= numbersArray.size(); i++) {
			Integer complement = sum - numbersArray.get(i);
			if (map.containsKey(complement)) {
				return Arrays.asList(map.get(complement), i);
			}
			map.put(numbersArray.get(i), i);
		}
		return numbersArray;
	}

}
