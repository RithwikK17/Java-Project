package com.array_problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test14 {
	
	public static void firstRepeatElement(int[] arr) {
		Map<Integer,Integer> map =new HashMap<>();
		
		for(int ele:arr) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {  // checking whether elements are present or not
            Map.Entry<Integer, Integer> firstEntry = iterator.next();
            System.out.println("First Key: " + firstEntry.getKey());
        }
	}

	public static void main(String[] args) {
		int[] arr= {10,5,3,4,3,5,6};
		firstRepeatElement(arr);
	}

}
