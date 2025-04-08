package com.array_problems;

public class Test21 {

	    public static int maxProfit(int[] prices) {
	        int minPrice = Integer.MAX_VALUE;
	        int maxProfit = 0;

	        for (int price : prices) {
	            if (price < minPrice) {
	                minPrice = price; // update minimum price so far
	            } else if (price - minPrice > maxProfit) {
	                maxProfit = price - minPrice; // update max profit
	            }
	        }

	        return maxProfit;
	    }

	    public static void main(String[] args) {
	        int[] prices = {7, 1, 5, 3, 6, 4};
	        System.out.println("Maximum Profit: " + maxProfit(prices));  // Output: 5
	    }
	}

