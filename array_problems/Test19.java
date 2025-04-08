package com.array_problems;

public class Test19 {
	
	  public static void main(String[] args) {
	       int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

	        int maxSum = -1000000; // A small value to start
	        int currentSum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            currentSum = currentSum + arr[i]; // Add current element

	            if (currentSum > maxSum) {
	                maxSum = currentSum; // Update max sum
	            }

	            if (currentSum < 0) {
	                currentSum = 0; // Reset current sum if it goes negative
	            }
	        }

	        System.out.println("Maximum contiguous sum is: " + maxSum);
	    }
	}
