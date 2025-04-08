package com.array_problems;

public class Test3 {
	
	public static int[] reverseArray(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];			
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {3,5,1,23,12,6};
		arr = reverseArray(arr);
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}

}
