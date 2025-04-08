package com.array_problems;

public class Test18 {
	
	public static boolean findSubArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				
				if(sum==0) {
					return true;
				}
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] arr= {4,2,-3,1,6};		
		boolean flag=findSubArray(arr);
		if(flag) {
			System.out.println("There is a subarray that matches sum");
		}
		else {
			System.out.println("There is no subarray found");
		}
	}

}
