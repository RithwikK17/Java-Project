package com.arrays;

//WAP to find the Kth largest element from the array
import java.util.Collections;
import java.util.PriorityQueue;

public class test11 {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 1, 6, 9, 2, 12, 10 };
		int k = 4;
		int count = 1;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
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
