package com.mtm.examples.manju;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Easy_TwoSum {

	public static void main(String[] args) {
		
		int sum = 8;
		int[] numbersArray = { 1, 5, 6, 8, 3 };

		int[] result = twoSum(numbersArray, sum);
		if (result != null) {
			System.out.println("Indices of the two numbers: " + Arrays.toString(result));
		} else {
			System.out.println("No two numbers found with the sum " + sum);
		}

	}

	private static int[] twoSum(int[] numbersArray, Integer sum) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i <= numbersArray.length; i++) {
			Integer complement = sum - numbersArray[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(numbersArray[i], i);
		}
		return numbersArray;
	}

}
