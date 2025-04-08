package com.array_problems;

public class Test11 {
	
	public static void move(int[] arr) {	
		int j=0; // pointer that points positive as it moves its index position
		for(int i=0;i<arr.length;i++) {			
			if(arr[i]<0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}						
		}
		for(int ele:arr) {
			System.out.print(ele+",");
		}
	}

	public static void main(String[] args) {
		int[] arr= {-12, 11,-13,-5,6,-7,5,-3,6};
		move(arr);
	}

}
