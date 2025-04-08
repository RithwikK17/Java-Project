package com.array_problems;

import java.util.HashMap;
import java.util.Map;


public class Test9 {
	public static void main(String[] args) {
		int[] arr= {0,2,1,1,0,0,2,2,1,1};
		withoutSorting(arr);
	}
	public static void withoutSorting(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int ele:arr) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			int countValue=entry.getValue();
			int i=0;
			while(i<countValue) {
				System.out.print(entry.getKey()+",");
				i++;
			}
			
		}
	}


}
