package com.array_problems;

public class Test22 {	
	    public static int countWays(int[] coins, int sum) {
	        int n = coins.length;
	        int[] dp = new int[sum + 1];
	        dp[0] = 1; // There is 1 way to make sum = 0

	        for (int coin : coins) {
	            for (int i = coin; i <= sum; i++) {
	                dp[i] += dp[i - coin];
	            }
	        }

	        return dp[sum];
	    }

	    public static void main(String[] args) {
	        int[] coins = {1, 2, 3};
	        int sum = 4;
	        System.out.println("Total combinations to make sum " + sum + ": " + countWays(coins, sum));
	    }
	}

