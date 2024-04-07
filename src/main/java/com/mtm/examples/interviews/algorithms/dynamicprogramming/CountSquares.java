package com.mtm.examples.interviews.algorithms.dynamicprogramming;

public class CountSquares {

	public static void main(String[] args) {
		CountSquares countSquares = new CountSquares();

		int[][] matrix = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } };
		countSquares.countSquaresOfOnes(matrix);
	}

	public int countSquaresOfOnes(int[][] matrix) {
		int total = 0;
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0)
					continue;
				if (i == 0 || j == 0) {
					total += matrix[i][j];
					continue;
				}
				int min = Math.min(matrix[i - 1][j], Math.min(matrix[i][j - 1], matrix[i - 1][j - 1]));
				matrix[i][j] += min;
				total += matrix[i][j];
			}
		}
		return total;
	}

}