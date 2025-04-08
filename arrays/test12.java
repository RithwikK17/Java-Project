package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

//WAP to find the Kth Smallest element in an array 
public class test12 {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 7, 8, 9, 10, 12 };
		int k = 1;
		int count = 1;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int ele : arr) {
			priorityQueue.add(ele);
		}
		while (count < k) {
			priorityQueue.poll();
			count++;
		}
		System.out.println(priorityQueue.peek());
	}
}
