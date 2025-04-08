package com.arrays;

//WAP to reverse an array 
public class test4 {
	public static int[] rev(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[length - 1 - i];
			arr[length - 1 - i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		rev(numbers);
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
