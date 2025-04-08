package com.array_problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test15 {
	
	public static void firstNonRepeatingElement(int[] arr) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int ele:arr) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
			map.put(ele,1);
			}			
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {				
				Integer e=entry.getKey();
				System.out.println("The first non-repeating element in an array is:"+e);
				break;				
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {-1,2,-1,3,0};
		firstNonRepeatingElement(arr);

	}

}
