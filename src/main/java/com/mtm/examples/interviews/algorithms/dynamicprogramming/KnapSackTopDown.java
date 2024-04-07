package com.mtm.examples.interviews.algorithms.dynamicprogramming;

import java.util.Arrays;

public class KnapSackTopDown {

	public static void main(String[] args) {
		int[] weight = { 1, 2, 3, 5 };
		int[] value = { 1, 3, 5, 7 };
		int n = 4;
		int W = 7;
		int[][] memMatrix = new int[weight.length + 1][W + 1];
		// Fill each row with 1.0
		for (int[] row : memMatrix)
			Arrays.fill(row, -1);

		KnapSackTopDown knapSackTopDown = new KnapSackTopDown();

		System.out.println(knapSackTopDown.maxValue(weight, value, W, n, memMatrix));
	}

	public int maxValue(int[] weight, int value[], int W, int n, int[][] memMatrix) {

		// weight= array of weights of item //array of value of items //W total weight
		// of the Knapsack
		// n =size of the available array

		if (n == 0 || W == 0)
			return 0;

		if (memMatrix[n][W] != -1)
			return memMatrix[n][W];

		if (weight[n - 1] <= W) {
			return memMatrix[n][W] = Math.max(
					value[n - 1] + maxValue(weight, value, W - weight[n - 1], n - 1, memMatrix),
					maxValue(weight, value, W, n - 1, memMatrix));

		} else
			return memMatrix[n][W] = maxValue(weight, value, W, n - 1, memMatrix);

	}

}