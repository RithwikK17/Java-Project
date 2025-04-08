package com.array_problems;

import java.util.Scanner;

public class Test13 {
	
	public static void sumEqualToK(int[] arr,int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k)
				{
					count++;
					System.out.println("The possible pairs are:("+arr[i]+","+arr[j]+")");
				}
			}
		}
		System.out.println("Total Pairs:"+count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,5,7,-1,5};
		System.out.print("Enter the value to find out sum in array:");
		int k = sc.nextInt();
		sumEqualToK(arr,k);

	}

}
