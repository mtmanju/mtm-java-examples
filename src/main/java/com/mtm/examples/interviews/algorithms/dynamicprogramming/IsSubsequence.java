package com.mtm.examples.interviews.algorithms.dynamicprogramming;

public class IsSubsequence {

	public static void main(String[] args) {
		IsSubsequence isSubsequence = new IsSubsequence();
		isSubsequence.isSubsequence("leeeeetcode",
				"yyyyylyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

	}

	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}
		if (t.length() == 0) {
			return false;
		}

		boolean dp[] = new boolean[s.length() + 1];
		dp[0] = true;
		int i = 1;
		int j = 1;

		while (i <= s.length() && j <= t.length()) {
			if (s.charAt(i - 1) == t.charAt(j - 1) && dp[i - 1] == true) {
				dp[i] = true;
				i++;
				j++;
			} else {
				j++;
			}
		}

		for (boolean k : dp) {
			System.out.print(k + " ");
		}
		return dp[s.length()];
	}

}
