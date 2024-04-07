package com.mtm.examples.interviews.algorithms.dynamicprogramming;

public class KnapSackBottomsUp {

	public static void main(String[] args) {
		int[] weight = { 1, 2, 3, 5 };
		int[] value = { 1, 3, 5, 7 };
		int n = 4;
		int W = 7;
		// int[][] memMatrix = new int[10][20];
		// Fill each row with 1.0
//	        for (int[] row: memMatrix)
//	            Arrays.fill(row, 0);

		KnapSackBottomsUp knapSackTopDown = new KnapSackBottomsUp();
		System.out.println(knapSackTopDown.maxValue(weight, value, W, n));
	}

	public int maxValue(int[] weight, int value[], int W, int n) {

		int[][] memMatrix = new int[n + 1][W + 1];

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < W + 1; j++) {
				// if(i==0 || j==0) memMatrix[i][j]=0;

				if (weight[i - 1] <= j) {
					memMatrix[i][j] = Math.max(value[i - 1] + memMatrix[i - 1][j - weight[i - 1]], memMatrix[i - 1][j]);
				} else {
					memMatrix[i][j] = memMatrix[i - 1][j];
				}
			}
		}
		return memMatrix[n][W];
	}

}