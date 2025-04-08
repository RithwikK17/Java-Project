package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test15 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4, 7, 4, 5, 8, 7, 5 };
		// Collections
		List<Integer> list = new ArrayList<>();
		for (int ele : arr)
			list.add(ele);

		list.stream()
		.filter(x -> Collections.frequency(list, x) > 1)
		.distinct()
		.forEach(x -> System.out.println(x));
	}
}
