package com.arrays;

//WAP to find out the second maximum number in an array

public class test10 {
	public static int secondMaximum(int[] arr) {
		int max = arr[0];
		int secondMax = arr[0];

		for (int num : arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num != max)
				secondMax = num;
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 8, 12, 9, 11 };
		System.out.println("Second maximum in arr: " + secondMaximum(arr));
	}
}
