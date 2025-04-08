package com.array_problems;

public class Test17 {
	
	public static void rearrange(int[] arr) {
		int n = arr.length;
		int[] pos= new int[n];
		int[] neg= new int[n];
		int p=0,q=0;
		
//		separate the positive and negative numbers
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				pos[p++]=arr[i];				
			}
			else {
				neg[q++] = arr[i];
			}
		}
		
		// assigning all the values to the original array
		int i=0,j=0,k=0;
		while(i<p && j<q) {
			arr[k++]=pos[i++];
			arr[k++]=neg[j++];
		}
		
		// if any positive element left
		while(i<p) {
			arr[k++]=pos[i++];
		}
		
		// if any negative element left
		while(j<q) {
			arr[k++]=neg[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3-4,-1,4};
		rearrange(arr);
		
		// printing after rearranging elements
		for(int ele:arr) {
			System.out.print(ele+",");
		}

	}

}
