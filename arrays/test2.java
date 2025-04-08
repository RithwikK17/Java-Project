package com.arrays;

public class test2 {
	public static int sum(int[] arr) {
		int sum = 0;
//		for (int i = 0; i < arr.length; i++)
//			sum += arr[i];
//		return sum;
		for (int ele : arr)
			sum += ele;
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = sum(arr);
		System.out.println("sum of elements = " + sum);
	}
}
