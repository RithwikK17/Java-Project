package com.arrays;

import java.util.Scanner;

public class test18 {

	public static void add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("sum of two  numbers");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void substract(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = b[i][j] - a[i][j];
			}
		}
		System.out.println("subtraction of two  numbers");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void multiply(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];

				}
			}
		}
		System.out.println("multiplication of two  numbers");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };
		add(a, b);
		substract(a, b);
		multiply(a, b);

	}

}