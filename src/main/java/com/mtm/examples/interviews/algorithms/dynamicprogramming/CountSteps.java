package com.mtm.examples.interviews.algorithms.dynamicprogramming;

class CountSteps {

	int minCost = 0;

	public static void main(String[] args) {
		CountSteps countSteps = new CountSteps();
		int[] cost = { 10, 15, 10 };
		countSteps.minCostClimbingStairs(cost);
	}

	public int minCostClimbingStairs(int[] cost) {
		return minCost(cost, cost.length);
	}

	private int minCost(int[] cost, int len) {
		if (len < 2)
			return 0;
		if (len == 2) {
			minCost += Math.min(cost[1], cost[0]);
			return minCost;
		}
		return minCost += Math.min(minCost(cost, len - 1), minCost(cost, len - 2));
	}

}