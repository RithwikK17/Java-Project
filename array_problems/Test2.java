package com.array_problems;

public class Test2 {
	
	public static int[] sortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
						
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {3,5,1,23,12,6};
		arr=sortedArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
