package com.array_problems;

public class Test10 {
	
	public static void subArray(int[] arr, int target) {
		int start =0;
		int end =0;
		int sum =0;
		while(end<arr.length) {
			sum+=arr[end];
			
			while(sum>target && start<=end) {
				sum-=arr[start];
				start++;
			}
			if(sum==target) {
				System.out.print("{");
				while(start<end) {
					System.out.print(arr[start]+",");
					start++;
				}
				System.out.println(arr[end]+"}");
			}
			end++;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        subArray(arr,target);
	}

}
