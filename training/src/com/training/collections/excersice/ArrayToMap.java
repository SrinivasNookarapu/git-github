package com.training.collections.excersice;

import java.util.*;

public class ArrayToMap {
	
	static HashMap<Integer, String> convertToMap(String[] names){
		HashMap<Integer, String> h = new HashMap<>();
		int key = 1;
		for (int i = 0; i < names.length; i++) {
			h.put(key, names[i]);
			key++;
		}
		return h;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ");
		String[] str = new String[sc.nextInt()];
		System.out.println("enter String");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();			
		}
		HashMap<Integer, String> h = convertToMap(str);
		
		for (Map.Entry<Integer, String> s : h.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		

	}

}
