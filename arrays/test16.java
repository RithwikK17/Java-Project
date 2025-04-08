package com.arrays;

public class test16 {
	public static void sort(int[] arr) {
		int count0 = 0, count1 = 0, count2 = 0;

		for (int num : arr) {
			if (num == 0)
				count0++;
			else if (num == 1)
				count1++;
			else
				count2++;
		}
		int index = 0;
		for (int i = 0; i < count0; i++)
			arr[index++] = 0;
		for (int i = 0; i < count1; i++)
			arr[index++] = 1;
		for (int i = 0; i < count2; i++)
			arr[index++] = 2;
	}
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 0, 2, 2, 1, 1 };
		sort(arr);
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
