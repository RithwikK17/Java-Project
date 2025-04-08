package com.array_problems;

public class Test20 {
	
	
	public static void maximumProduct(int[] arr) {
		int maximumProduct = Integer.MIN_VALUE;
		System.out.println(maximumProduct);
		for(int i=0;i<arr.length;i++) {
			int prod=1;
			for(int j=i;j<arr.length;j++) {
				prod*=arr[j];
				if(prod>maximumProduct) {
					maximumProduct=prod;
				}
			}
		}
		System.out.println("The product of the maximum product subarray is:"+maximumProduct);
	}

	public static void main(String[] args) {
		int[] arr= {6,-3,-10,0,2};
		maximumProduct(arr);

	}

}
