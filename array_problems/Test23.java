package com.array_problems;

public class Test23 {

	public static int coinChange(int[] coins, int amount) {
	        int[] dp = new int[amount + 1];
	        
	        // Initialize with a large number (infinity)
	        for (int i = 1; i <= amount; i++) {
	            dp[i] = Integer.MAX_VALUE;
	        }
	        dp[0] = 0;  // Base case: 0 coins to make 0 amount

	        // Fill dp[] table
	        for (int coin : coins) {
	            for (int i = coin; i <= amount; i++) {
	                if (dp[i - coin] != Integer.MAX_VALUE) {
	                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	                }
	            }
	        }

	        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
	    }

	    public static void main(String[] args) {
	        int[] coins = {1, 2, 3};
	        int amount = 4;
	        int result = coinChange(coins, amount);
	        System.out.println("Minimum number of coins required: " + result);
	    }
	}

