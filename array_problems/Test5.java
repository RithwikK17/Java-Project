package com.array_problems;

import java.util.Scanner;

public class Test5 {
	
	public static void possiblePairs(int[] arr ,int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println("The Possible Pairs whose sum matches k are:{"+arr[i]+","+arr[j]+"}");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the sum to find out the possible pairs:");
		int k = sc.nextInt();
		possiblePairs(arr,k);

	}

}
