package com.array_problems;

public class Test8 {
	public static void maximumElement(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The maximum element in an array is:"+max);
	}
	
	public static void minimumElement(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The minimum element in an array is:"+min);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,12};
		maximumElement(arr);
		minimumElement(arr);
	}

}
