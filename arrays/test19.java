package com.arrays;

public class test19 {

	public static void main(String[] args) {
		int[][] a = { { 11, 2, 14 }, { 5, 1, 19 }, { 6, 1, 3 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				if (a[i][j] > a[i][j + 1]) {

					int temp = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}