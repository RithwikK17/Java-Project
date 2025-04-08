package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

//WAP to find the duplicate elements
public class test13 {
	public static void duplicateElements(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<>();

		// traverse and store elements along with count

		for (int ele : arr) {
			if (map.containsKey(ele)) {
				map.put(ele, map.get(ele) + 1);
			} else {
				map.put(ele, 1);
			}
		}
		// System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4, 7, 4, 5, 8, 7, 5 };
		duplicateElements(arr);
	}
}
