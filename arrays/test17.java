package com.arrays;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows = in.nextInt();

		System.out.println("Enter the no of columns");
		int cols = in.nextInt();

		int[][] ar = new int[rows][cols];

		System.out.println("Enter the elements :");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = in.nextInt();
			}
		}
		System.out.println("Displaying elements:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}