package com.array_problems;

public class Test16 {
	
	public static void countSubArray(int[] arr) {
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			int zeros=0,ones=0;
			for(int j=i;j<n;j++) {
				if(arr[j]==0) zeros++;
				else ones++;
				
				if(zeros==ones) {
					count++;					
				}
			}
		}
		System.out.println("The number of sub-arrays found in the given array is:"+count);
	}

	public static void main(String[] args) {
		int[] arr= {1,0,0,1,0,1,1};
		countSubArray(arr);

	}

}
