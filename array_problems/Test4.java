package com.array_problems;

import java.util.Scanner;

public class Test4 {
	public static int searchElement(int[]arr,int key) {
		int flag=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag=i;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {3,5,1,23,12,6};
		System.out.println("Enter the key element to be searched:");
		int key=sc.nextInt();
		int index = searchElement(arr,key);
		System.out.println("The key element found at index position:"+index);
	}

}
