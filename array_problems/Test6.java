package com.array_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
		int[] arr = {1,2,5,2,1,4,2,5,3,1,2,3};
		
		Map<Integer,Integer> map =new LinkedHashMap<>();
		
//		traverse elements of an array
		for(int ele:arr) {
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {			
			System.out.println("The frequency of element "+entry.getKey()+" in an array is:"+entry.getValue());			
		}

	}

}
