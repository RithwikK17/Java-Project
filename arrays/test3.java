package com.arrays;
//WAP to sort the elements of the array 
public class test3 {
	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 7, 6, 2, 5 };
		sort(arr);
		for (int num : arr)
			System.out.print(num + " ");
	}
}
