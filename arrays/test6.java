package com.arrays;

//WAP to print all possible pairs whose sum equals to K
public class test6 {
	public static void possiblePairs(int arr[], int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println("The possible pairs are:" + arr[i] + "," + arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 11;
		possiblePairs(arr, k);
	}
}