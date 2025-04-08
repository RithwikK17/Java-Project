package com.arrays;

//WAP to find the minimum and maximum element in an array
public class test9 {
	public static void minMax(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Min element: " + min);
		System.out.println("Max element: " + max);
	}
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		minMax(arr);
	}
}
