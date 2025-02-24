package com.mtm.examples.manju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Easy_ThreeSum {

	public static void main(String[] args) {

		int sum = 14;
		List<Integer> listOfNumbers = Arrays.asList(1, 5, 6, 8, 3, 7);

		List<List<Integer>> result = threeSum(listOfNumbers, sum);
		if (result != null) {
			System.out.println("Indices of the three numbers: " + result);
		} else {
			System.out.println("No three numbers found with the sum " + sum);
		}
	}

	public static List<List<Integer>> threeSum(List<Integer> numbersList, int sum) {
		List<List<Integer>> result = new ArrayList<>();
		Collections.sort(numbersList); // Sort the list

		for (int i = 0; i < numbersList.size() - 2; i++) {
			if (i > 0 && numbersList.get(i).equals(numbersList.get(i - 1))) {
				continue; // Skip duplicates
			}

			int left = i + 1;
			int right = numbersList.size() - 1;

			while (left < right) {
				int currentSum = numbersList.get(i) + numbersList.get(left) + numbersList.get(right);

				if (currentSum == sum) {
					result.add(Arrays.asList(numbersList.get(i), numbersList.get(left), numbersList.get(right)));
					left++;
					right--;

					// Skip duplicates
					while (left < right && numbersList.get(left).equals(numbersList.get(left - 1))) {
						left++;
					}
					while (left < right && numbersList.get(right).equals(numbersList.get(right + 1))) {
						right--;
					}
				} else if (currentSum < sum) {
					left++;
				} else {
					
					right--;
				}
			}
		}

		return result;
	}

}
